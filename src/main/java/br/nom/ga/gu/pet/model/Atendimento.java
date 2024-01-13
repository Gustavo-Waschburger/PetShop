package br.nom.ga.gu.pet.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Atendimento {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="dt_atendimento")
    private LocalDateTime data;
    private String nome;
    private boolean pgtoEfetuado;
    private Integer valorConsulta;
    private String estado;
    @Column(name="nome_veterinario")
    private String nomeVeterinario;
    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "pet_id", referencedColumnName = "id_Pet")
    private Pet pet;

/**    @ManyToMany(mappedBy = "produto", cascade = {CascadeType.ALL})
    @JoinColumn(name = "produto_id", referencedColumnName = "idProduto")
    private List<Produto> produtos;*/

    @ManyToOne
    @JoinColumn(name = "unidade_id", referencedColumnName = "id")
    private Unidade unidade;

}
