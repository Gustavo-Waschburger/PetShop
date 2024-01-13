package br.nom.ga.gu.pet.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
public class AtendimentoProduto {

    @EmbeddedId
    private AtendimentoProdutoId id;
    @ManyToOne
    @MapsId("produtoId")
    @JoinColumn(name = "idProduto", referencedColumnName = "idProduto", columnDefinition = "INT")
    private Produto produto;
    @ManyToOne
    @MapsId("atendimentoId")
    @JoinColumn(name = "atendimento_Id", referencedColumnName = "id", columnDefinition = "INT")
    private Atendimento atendimento;

    private LocalDateTime dataEntrada;
    private Integer quantidade;
}
