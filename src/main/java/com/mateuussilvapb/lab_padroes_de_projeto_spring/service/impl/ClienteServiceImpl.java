package com.mateuussilvapb.lab_padroes_de_projeto_spring.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateuussilvapb.lab_padroes_de_projeto_spring.model.Cliente;
import com.mateuussilvapb.lab_padroes_de_projeto_spring.model.Endereco;
import com.mateuussilvapb.lab_padroes_de_projeto_spring.repository.ClienteRepository;
import com.mateuussilvapb.lab_padroes_de_projeto_spring.repository.EnderecoRepository;
import com.mateuussilvapb.lab_padroes_de_projeto_spring.service.ClienteService;
import com.mateuussilvapb.lab_padroes_de_projeto_spring.service.ViaCepService;

//======================================= //
@Service
public class ClienteServiceImpl implements ClienteService {

	// ======================================= //
	@Autowired
	private ClienteRepository clienteRepository;

	// ======================================= //
	@Autowired
	private EnderecoRepository enderecoRepository;

	// ======================================= //
	@Autowired
	private ViaCepService viaCepService;

	// ======================================= //
	@Override
	public Iterable<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	// ======================================= //
	@Override
	public Cliente buscarPorId(Long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.orElseThrow();
	}

	// ======================================= //
	@Override
	public void inserir(Cliente cliente) {
		salvarClienteComCep(cliente);
	}

	// ======================================= //
	@Override
	public void atualizar(Long id, Cliente cliente) {
		Optional<Cliente> clienteBd = clienteRepository.findById(id);
		if (clienteBd.isPresent()) {
			salvarClienteComCep(cliente);
		}

	}

	// ======================================= //
	@Override
	public void deletar(Long id) {
		clienteRepository.deleteById(id);

	}

	// ======================================= //
	private void salvarClienteComCep(Cliente cliente) {
		String cep = cliente.getEndereco().getCep();
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
		cliente.setEndereco(endereco);
		clienteRepository.save(cliente);
	}

}
