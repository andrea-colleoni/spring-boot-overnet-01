package corso.spring.giorno2.configuration;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.zalando.problem.spring.web.advice.general.GeneralAdviceTrait;
import org.zalando.problem.spring.web.advice.http.HttpAdviceTrait;
import org.zalando.problem.spring.web.advice.io.IOAdviceTrait;
import org.zalando.problem.spring.web.advice.routing.RoutingAdviceTrait;
import org.zalando.problem.spring.web.advice.validation.ValidationAdviceTrait;

// vedi: https://www.baeldung.com/problem-spring-web

@ControllerAdvice
public class ExceptionHandler implements 	GeneralAdviceTrait,
											HttpAdviceTrait,
											IOAdviceTrait,
											RoutingAdviceTrait,
											ValidationAdviceTrait {

}
