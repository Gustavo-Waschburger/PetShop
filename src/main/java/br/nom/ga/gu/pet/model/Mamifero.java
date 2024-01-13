package br.nom.ga.gu.pet.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Mamifero extends TipoAnimal {
    @Id
    private Integer id;
    @Column(length = 100)
    private String raca;
    private Boolean possuiPelos;
    @OneToMany(mappedBy = "mamifero", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Vacina> vacinas;
}
