package br.nom.ga.gu.pet.repository;

import br.nom.ga.gu.pet.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface ClienteRep extends JpaRepository<Cliente, Integer> {

}
