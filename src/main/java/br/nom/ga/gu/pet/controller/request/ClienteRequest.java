package br.nom.ga.gu.pet.controller.request;

import br.nom.ga.gu.pet.model.Cliente;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ClienteRequest {

    private String nome;

    //    @JsonProperty("cpfBR")
    private String cpf;

    private List<EnderecoRequest> enderecos;

    public Cliente toModel() {
        return Cliente.builder()
                .nome(nome)
                .cpf(cpf)
                .enderecos(EnderecoRequest.toModelList(enderecos))
                .build();
    }
}