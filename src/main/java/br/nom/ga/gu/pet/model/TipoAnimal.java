package br.nom.ga.gu.pet.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public  class TipoAnimal {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 80)
    private String especie;
    @OneToMany(mappedBy = "tipoAnimal", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pet> pets;
    @OneToMany(mappedBy = "tipoAnimal", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Produto> produtos;
}
