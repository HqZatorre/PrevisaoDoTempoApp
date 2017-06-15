package com.exercicio.hqzatorre.previsaodotempo.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;

/**
 * Created by lab on 6/8/17.
 * para buscar id de cidade de http://servicos.cptec.inpe.br/XML/#res-busca-localidade
 */

@Root(strict = false)
public class Cidade {
    /*
    <cidade>
     <nome>São Paulo</nome>
     <uf>SP</uf>
     <id>244</id>
   </cidade>
    */
    @Element
    private String nome;
    @Element
    private Estado uf;
    @Element(required = false)
    private Integer id;
    @ElementList(inline=true, required = false)
    private ArrayList<Previsao> previsao;

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

    public ArrayList<Previsao> getPrevisao() {
        return previsao;
    }

    public void setPrevisao(ArrayList<Previsao> previsao) {
        this.previsao = previsao;
    }
}