package com.mateuussilvapb.lab_padroes_de_projeto_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr. Os seguintes módulos forma
 * selecionados: - Spring Data JPA - Spring Web - H2 Database - OpenFeign
 * 
 * @author mateuussilvapb
 *
 */
//======================================= //
@EnableFeignClients
@SpringBootApplication
public class LabPadroesDeProjetoSpringApplication {
	// ======================================= //
	public static void main(String[] args) {
		SpringApplication.run(LabPadroesDeProjetoSpringApplication.class, args);
	}

}
