package artemtsmyg.ru.ApiGateWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiGateWayApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApiGateWayApplication.class, args);
	}
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("service1",r->r.path("/serviceOne/**")
						.uri("http://localhost:8084/"))
				.route("service2",r->r.path("/serviceTwo/**")
						.uri("http://localhost:8085/"))
				.route("service3",r->r.path("/serviceThree/**")
						.uri("http://localhost:8086/"))
				.build();}


}
