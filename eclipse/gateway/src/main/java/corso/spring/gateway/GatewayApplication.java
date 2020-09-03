package corso.spring.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
	    return builder.routes()
	    		.route(p -> p 
	    				.path("/ordini/**")
	    				.uri("lb://ORDINI"))
	    		.route(p -> p 
	    				.path("/clienti")
	    				.uri("lb://CLIENTI"))	    		
	    		.route(p -> p
    	            .path("/get")
    	            .filters(f -> f.addRequestHeader("Insiel-User", "World"))
    	            .uri("http://httpbin.org:80"))
	    		.route(p -> p
    	            .host("*.hystrix.com")
    	            .filters(f -> f.hystrix(config -> config
    	            		.setName("mycmd")
    	            		.setFallbackUri("forward:/fallback")
    	            ))
    	            .uri("http://httpbin.org:80"))	    		
	    		.build();
	}

}
