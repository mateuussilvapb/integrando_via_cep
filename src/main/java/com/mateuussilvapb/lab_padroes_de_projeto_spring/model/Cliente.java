package com.mateuussilvapb.lab_padroes_de_projeto_spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// ======================================= //
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
	// ======================================= //
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	// ======================================= //
	private String nome;
	// ======================================= //
	@ManyToOne
	private Endereco endereco;
}
