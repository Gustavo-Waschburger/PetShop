package br.nom.ga.gu.pet.controller.request;

import br.nom.ga.gu.pet.model.Produto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProdutoRequest {
    private String nome;
    private Integer preco;
    private String descricao;

    public Produto toModel() {
        return Produto.builder()
                .nome(nome)
                .valor(preco)
                .descricao(descricao)
                .build();
    }
}
