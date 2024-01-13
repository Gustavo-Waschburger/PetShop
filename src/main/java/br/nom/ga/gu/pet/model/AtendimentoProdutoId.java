package br.nom.ga.gu.pet.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class AtendimentoProdutoId implements Serializable {
    @Column(name = "produto_Id")
    private Integer produtoId;
    @Column(name = "atendimento_Id")
    private Integer atendimentoId;

}
