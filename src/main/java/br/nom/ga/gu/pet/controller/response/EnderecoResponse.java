package br.nom.ga.gu.pet.controller.response;

import br.nom.ga.gu.pet.model.Endereco;
import lombok.Data;

@Data
public class EnderecoResponse {
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String cep;


    public EnderecoResponse(String logradouro, Integer numero, String bairro, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;

    }

    public EnderecoResponse of(Endereco endereco){
        return new EnderecoResponse(
                endereco.getLogradouro(),
                endereco.getNumero(),
                endereco.getBairro(),
                endereco.getCep()
        );
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
