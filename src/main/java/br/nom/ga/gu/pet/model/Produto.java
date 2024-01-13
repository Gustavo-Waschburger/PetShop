package br.nom.ga.gu.pet.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    @Id
    private Integer idProduto;
    @Column(length = 11)
    private Integer valor;
    @Column(length = 50)
    private String nome;
    @Column(length = 150)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "tipoAnimal_id", referencedColumnName = "id")
    private  TipoAnimal tipoAnimal;
/**
    @ManyToMany
    @JoinColumn(name = "atendimento_id", referencedColumnName = "id")
    public List<Atendimento> atendimentos;*/
}
