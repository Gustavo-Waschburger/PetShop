package br.nom.ga.gu.pet.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Vacina {
    @Id
    private Integer id;
    private LocalDate validade;
    private String doencasAplicadas;
    @ManyToOne
    @JoinColumn(name = "mamifero_id", referencedColumnName = "id")
    private Mamifero mamifero;
}
