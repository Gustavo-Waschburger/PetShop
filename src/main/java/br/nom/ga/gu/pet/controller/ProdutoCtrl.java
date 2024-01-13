package br.nom.ga.gu.pet.controller;

import br.nom.ga.gu.pet.controller.request.ProdutoRequest;
import br.nom.ga.gu.pet.controller.response.ProdutoResponse;
import br.nom.ga.gu.pet.model.Produto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/produtos")
public class ProdutoCtrl {
    private List<Produto> produtos = new ArrayList<>();
        @GetMapping(path = "")
        public List<ProdutoResponse> procurarProdutos(
        @RequestParam(required = false) String nome,
        @RequestParam(required = false) String precoMaiorque,
        @RequestParam(required = false) String precoMenorque
        ){
        return new ArrayList<>();
    }
    @PostMapping(path = "")
    @ResponseStatus(HttpStatus.CREATED)
    public void criarProdutos(@RequestBody ProdutoRequest produtoRequest){
        this.produtos.add(produtoRequest.toModel());
    }
    @DeleteMapping(path = "/{id}")
    public void apagarProduto(@PathVariable(name = "id")Integer idProduto){

    }
    @PutMapping(path = "/{id}")
    public void editarProduto(@PathVariable(name = "id")Integer id){

    }
}
