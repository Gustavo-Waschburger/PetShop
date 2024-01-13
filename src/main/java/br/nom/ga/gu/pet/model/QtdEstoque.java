package br.nom.ga.gu.pet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QtdEstoque {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer qtdAtual;
    private Integer id_produto;

}
