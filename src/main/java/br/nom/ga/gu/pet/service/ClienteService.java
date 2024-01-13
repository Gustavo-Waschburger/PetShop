package br.nom.ga.gu.pet.service;

import br.nom.ga.gu.pet.model.Cliente;
import br.nom.ga.gu.pet.repository.ClienteRep;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private ClienteRep clienteRepository;
    public Cliente create(Cliente cliente){
        return clienteRepository.save(cliente);
    }
}

