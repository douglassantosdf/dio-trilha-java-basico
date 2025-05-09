package com.douglassantos.springgof.service.impl;

import com.douglassantos.springgof.repository.ClienteRepository;
import com.douglassantos.springgof.repository.EnderecoRepository;
import com.douglassantos.springgof.model.Cliente;
import com.douglassantos.springgof.model.Endereco;
import com.douglassantos.springgof.service.ClienteService;
import com.douglassantos.springgof.service.ViaCepService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImp implements ClienteService {

    private final ClienteRepository repository;
    private final EnderecoRepository enderecoRepository;
    private final ViaCepService viaCepService;

    public ClienteServiceImp(ClienteRepository repository, EnderecoRepository enderecoRepository, ViaCepService viaCepService) {
        this.repository = repository;
        this.enderecoRepository = enderecoRepository;
        this.viaCepService = viaCepService;
    }

    @Override
    public Iterable<Cliente> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvaCliente(cliente);
    }

    private void salvaCliente(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(
                ()-> {
                    var novo = viaCepService.consultaCep(cep);
                    cliente.setEndereco(novo);
                    enderecoRepository.save(novo);
                    return novo;
                }
        );
        cliente.setEndereco(endereco);
        repository.save(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        var clienteF = repository.findById(id);
        if(clienteF.isPresent())
            salvaCliente(cliente);

    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
