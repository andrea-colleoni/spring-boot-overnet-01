package corso.spring.clienti.controller;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import corso.spring.clienti.configuration.OrdiniClient;
import corso.spring.clienti.model.Ordine;

@RestController
public class OrdiniClientController {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
    private RestTemplate restTemplate;
	
	@Autowired
	private OrdiniClient ordiniClient;

	@GetMapping("/ordini")
	public List<Ordine> ordini() {
        return ordiniClient.getOrdini();
	};
	
	@GetMapping("/debug")
	public String debug() {
		StringBuilder result = new StringBuilder();
		discoveryClient.getInstances("ORDINI").forEach((ServiceInstance s) -> {
			System.out.println(ToStringBuilder.reflectionToString(s));
		});
		System.out.println(result.toString());
		/*
		ResponseEntity<List<Ordine>> exchange =
                this.restTemplate.exchange(
                        "http://ORDINI/",
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<Ordine>>() {
                        },
                        (Object) "mstine");

        exchange.getBody().forEach(o -> result.append(o.toString()));
        */
		ordiniClient.getOrdini().forEach(o -> result.append(o.toString()));
        return result.toString();
	};

}
