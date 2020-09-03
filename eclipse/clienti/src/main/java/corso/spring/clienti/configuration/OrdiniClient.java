package corso.spring.clienti.configuration;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import corso.spring.clienti.model.Ordine;

@FeignClient("ORDINI")
public interface OrdiniClient {
	
	@RequestMapping(method = RequestMethod.GET, value="/ordini")
    List<Ordine> getOrdini();
}
