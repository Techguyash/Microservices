package com.ms.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.util.RouteMatcher;

import java.time.LocalDateTime;

@SpringBootApplication
public class GatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServerApplication.class, args);
	}


	@Bean
	public RouteLocator eazybankRouteConfig(RouteLocatorBuilder routeLocatorBuilder)
	{
		return routeLocatorBuilder.routes()
				.route(p->
						p.path("/eazybank/accounts/**")
								.filters(f->f.rewritePath("/eazybank/accounts/(?<segment>.*)","/${segment}")
										.addResponseHeader("X-ResponseTime", LocalDateTime.now().toString())
								)

								.uri("lb://ACCOUNTS")
				)
				.route(p->
						p.path("/eazybank/loans/**")
								.filters(f->f.rewritePath("/eazybank/loans/(?<segment>.*)","/${segment}")
										.addResponseHeader("X-ResponseTime", LocalDateTime.now().toString()))
								.uri("lb://LOANS")
				)
				.route(p->
						p.path("/eazybank/cards/**")
								.filters(f->f.rewritePath("/eazybank/cards/(?<segment>.*)","/${segment}")
										.addResponseHeader("X-ResponseTime", LocalDateTime.now().toString())
								)
								.uri("lb://CARDS")
				)
				.build();
	}


}
