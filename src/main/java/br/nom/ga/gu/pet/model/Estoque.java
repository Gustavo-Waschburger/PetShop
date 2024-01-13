package br.nom.ga.gu.pet.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Estoque {
    @Id
    private Integer id;
    private LocalDate data_operacao;
    @Enumerated(EnumType.STRING)
    @Column(length = 15)
    private Tipo_Operacao tipoOperacao;
    private Integer quantidade;
    private Date validate;
    private String lote;
}
