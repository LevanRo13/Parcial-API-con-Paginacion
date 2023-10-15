package com.example.ParcialAPIPaginacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.ParcialAPIPaginacion.repositories")
public class ParcialApiPaginacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParcialApiPaginacionApplication.class, args);
		System.out.println("Estoy funcionando");
	}

}
