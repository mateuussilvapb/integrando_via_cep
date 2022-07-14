package com.mateuussilvapb.lab_padroes_de_projeto_spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * Os atributos desse modelo foram gerados automaticamente pelo site
 * https://www.jsonschema2pojo.org/. Para isso, utilizados o JSON de retorno da
 * API do ViaCEP.
 * 
 * @see <a href="https://www.jsonschema2pojo.org/">jsonschema2pojo</a>
 * @see <a href="https://viacep.com.br/">ViaCEP</a>
 * 
 * @author Mateus
 *
 */
//======================================= //
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
	// ======================================= //
	@Id
	private String cep;
	// ======================================= //
	private String logradouro;
	// ======================================= //
	private String complemento;
	// ======================================= //
	private String bairro;
	// ======================================= //
	private String localidade;
	// ======================================= //
	private String uf;
	// ======================================= //
	private String ibge;
	// ======================================= //
	private String gia;
	// ======================================= //
	private String ddd;
	// ======================================= //
	private String siafi;
}
