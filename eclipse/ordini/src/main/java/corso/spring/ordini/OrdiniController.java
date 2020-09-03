package corso.spring.ordini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import corso.spring.ordini.model.Ordine;
import corso.spring.ordini.repository.OrdiniRepository;

@RestController
public class OrdiniController {

	@Autowired
	private OrdiniRepository repository;
	
	@GetMapping("/ordini")
	public Iterable<Ordine> all() {
		return repository.findAll();
	}
}
