package br.nom.ga.gu.pet.controller.response;

import br.nom.ga.gu.pet.model.Produto;
import lombok.Data;

@Data
public class ProdutoResponse {
    private String nome;
    private Integer precoMaiorque;
    private Integer pecoMenorque;

    public ProdutoResponse(String nome, String descricao, Integer valor) {

    }

    public ProdutoResponse of(Produto produto){
        return new ProdutoResponse(
                produto.getNome(),
                produto.getDescricao(),
                produto.getValor()
        );
    }
}
