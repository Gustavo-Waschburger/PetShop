package br.nom.ga.gu.pet.controller.response;

import br.nom.ga.gu.pet.model.Cliente;
import br.nom.ga.gu.pet.model.Endereco;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class ClienteResponse {
    private Integer id;
    private String cpf;
    private String nome;
    private List<Endereco> enderecos;
   // private List<Pet> pets;
   // private List<Atendimento> atendimentos;

 /**   public ClienteResponse(Integer id, String cpf, String nome, List<Endereco> enderecos) {
       this.id = id;
       this.cpf = cpf;
       this.nome = nome;
       this.enderecos = enderecos;
      // this.atendimentos = atendimentos;
    }
/**
    public static ClienteResponse of(Cliente cliente) {
        return new ClienteResponse(
                cliente.getId(),
                cliente.getCpf(),
                cliente.getNome(),
                cliente.getEnderecos(),
                cliente.getAtendimentos()
        );
    }
*/
    public static ClienteResponse of(Cliente cliente){
        return ClienteResponse.builder()
                .id(cliente.getId())
                .nome(cliente.getNome())
                .cpf(cliente.getCpf())
               // .enderecos(EnderecoResponse.of(cliente.getEnderecos()))
                .build();
    }
}
