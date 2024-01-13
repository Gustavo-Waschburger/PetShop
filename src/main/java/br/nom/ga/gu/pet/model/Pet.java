package br.nom.ga.gu.pet.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    @Id
    private Integer id_Pet;
    @Column(length = 50)
    private String nome;
    private LocalDate dataNascimento;
    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "tipoAnimal_id", referencedColumnName = "id")
    private TipoAnimal tipoAnimal;
    @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Atendimento> atendimentos;
}
