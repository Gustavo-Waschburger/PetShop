package br.nom.ga.gu.pet.controller.request;

import br.nom.ga.gu.pet.model.Endereco;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class EnderecoRequest {
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String cep;


    public Endereco toModel() {
        return Endereco.builder()
                .logradouro(logradouro)
                .numero(numero)
                .bairro(bairro)
                .cep(cep)
                .build();
    }
    public static List<Endereco> toModelList(List<EnderecoRequest> enderecoRequests) {
        return enderecoRequests.stream()
                .map(EnderecoRequest::toModel)
                .collect(Collectors.toList());
    }
}
