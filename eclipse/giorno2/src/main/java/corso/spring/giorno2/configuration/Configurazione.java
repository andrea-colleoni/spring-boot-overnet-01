package corso.spring.giorno2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.problem.ProblemModule;
import org.zalando.problem.validation.ConstraintViolationProblemModule;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class Configurazione {
	
	@Bean
	public ObjectMapper objectMapper() {
	    return new ObjectMapper().registerModules(
	      new ProblemModule(),
	      new ConstraintViolationProblemModule());
	}

}
