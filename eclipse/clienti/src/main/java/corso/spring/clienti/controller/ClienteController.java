package corso.spring.clienti.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.zalando.problem.Problem;
import org.zalando.problem.Status;

import corso.spring.clienti.model.Cliente;
import corso.spring.clienti.repository.ClienteRepository;

@RestController
public class ClienteController {

	@Autowired
	private ClienteRepository repository;

	@GetMapping("/clienti")
	public Iterable<Cliente> list() {
		return repository.findAll();
	}

	@GetMapping("/cliente/{id}")
	public Cliente byId(@PathVariable int id) {
		return repository.findById(id).orElseThrow(() -> {
			throw Problem.builder()
			  .withType(URI.create("https://example.org/out-of-stock"))
			  .withTitle("Out of Stock")
			  .withStatus(Status.NOT_FOUND)
			  .withDetail("Item B00027Y5QG is no longer available")
			  .with("cliente", id)
			  .build();
		});
	}
	
	@PostMapping("/clienti")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente create(@RequestBody Cliente c) {
		return repository.save(c);
	}
	
	@PutMapping("/cliente/{id}")
	public Cliente update(@RequestBody Cliente c, @PathVariable int id) {
		if (c.getId() != id) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id non coincidenti");
		}
		repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		return repository.save(c);
	}
	
	@DeleteMapping("/cliente/{id}")
	public void delete(@PathVariable int id) {
		repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		repository.deleteById(id);
	}

}
