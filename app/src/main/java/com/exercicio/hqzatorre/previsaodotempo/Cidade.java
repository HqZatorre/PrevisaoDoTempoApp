package com.exercicio.hqzatorre.previsaodotempo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Created by lab on 6/8/17.
 */

public class Cidade {
    @JacksonXmlProperty
    private String nome;
    @JacksonXmlProperty()
    private Estado uf;
    @JacksonXmlProperty
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