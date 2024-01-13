package br.nom.ga.gu.pet.controller;

import br.nom.ga.gu.pet.controller.request.ClienteRequest;
import br.nom.ga.gu.pet.controller.response.ClienteResponse;
import br.nom.ga.gu.pet.model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteCtrl {
    //Imprementação com service
    //
    // private ClienteService clienteService;
    //Imprementação com service
    // public ClienteCtrl(ClienteService clienteService){this.clienteService = clienteService;}
    //@PostMapping
    //public ClienteResponse create(@RequestBody ClienteResponse cliente) {return ClienteResponse.of(clienteService.create(cliente.toModel())); }
    //getMapping(?)
    //deleteMapping(?)


    //Implementação para teste do controler
    private List<Cliente> clientes = new ArrayList<>();
    @GetMapping(path = "")
    public List<ClienteResponse> listaClientes(@RequestParam(required = false) String nome){
        return clientes.stream().map(ClienteResponse::of).toList();
    }
    @PostMapping(path = "")
    @ResponseStatus(HttpStatus.CREATED)
    public void criarCliente(@RequestBody ClienteRequest clienteRequest){
        this.clientes.add(clienteRequest.toModel());
    }
    @DeleteMapping(path = "/{id}")
    public void apagarCliente(@PathVariable(name = "id")Integer id){

    }
    @PutMapping(path = "/{id}")
    public void editarCliente(@PathVariable(name = "id")Integer id){

    }
}
