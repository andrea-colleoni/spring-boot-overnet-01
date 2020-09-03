package corso.spring.ordini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrdiniApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdiniApplication.class, args);
	}

}
