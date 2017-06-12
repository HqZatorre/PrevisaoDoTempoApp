package com.exercicio.hqzatorre.previsaodotempo.models;

/**
 * Created by lab on 6/8/17.
 * para buscar id de cidade de http://servicos.cptec.inpe.br/XML/#res-busca-localidade
 */

public class Cidade {
    /*
    <cidade>
     <nome>São Paulo</nome>
     <uf>SP</uf>
     <id>244</id>
   </cidade>
    */
    private String nome;
    private Estado uf;
    private Integer id;

    public Estado getUf() {
        return uf;
    }

    public void setUf(Estado uf) {
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}