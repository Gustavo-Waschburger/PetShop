package br.nom.ga.gu.pet.controller;

import br.nom.ga.gu.pet.controller.request.ProdutoRequest;
import br.nom.ga.gu.pet.controller.response.ProdutoResponse;
import br.nom.ga.gu.pet.model.Atendimento;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/atendimentos")
public class AtendimentoCtrl {
    private List<Atendimento> atendimentos = new ArrayList<>();
    @GetMapping(path = "")
    public List<AtendimentoResponse> procurarAtendimentos(
            @RequestParam(required = false) String nome,
            @RequestParam(required = false) String precoMaiorque,
            @RequestParam(required = false) String precoMenorque
    ){
        return new ArrayList<>();
    }
    @PostMapping(path = "")
    @ResponseStatus(HttpStatus.CREATED)
    public void criarAtendimentos(@RequestBody AtendimentoRequest atendimentoRequest){
        this.atendimentos.add(atendimentoRequest.toModel());
    }
    @DeleteMapping(path = "/{id}")
    public void apagarAtendimento(@PathVariable(name = "id")Integer idAtendimento){

    }
    @PutMapping(path = "/{id}")
    public void editarAtendimento(@PathVariable(name = "id")Integer id){

    }

}
