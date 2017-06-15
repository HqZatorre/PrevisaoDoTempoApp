package com.exercicio.hqzatorre.previsaodotempo.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.Date;
import java.util.List;

/**
 * Created by lab on 6/8/17.
 * para buscar id de cidade de http://servicos.cptec.inpe.br/XML/#res-busca-localidade
 * e previsao http://servicos.cptec.inpe.br/XML/#res-previsao-4-dias
 */
/*
<cidade>
 <nome>São Paulo</nome>
 <uf>SP</uf>
 <id>244</id>
</cidade>
*/
/*
<cidade>
    <nome>São Paulo</nome>
    <uf>SP</uf>
    <atualizacao>2011-08-09</atualizacao>
    <previsao>
        <dia>2011-08-10</dia>
        <tempo>n</tempo>
        <maxima>18</maxima>
        <minima>15</minima>
        <iuv>6.0</iuv>
    </previsao>
    <previsao>
        <dia>2011-08-11</dia>
        <tempo>n</tempo>
        <maxima>20</maxima>
        <minima>13</minima>
        <iuv>5.0</iuv>
    </previsao>
</cidade>
*/
@Root(strict = false)
public class Cidade {
    @Element
    private String nome;
    @Element
    private Estado uf;
    @Element(required = false)
    private Integer id;
    @Element(required = false)
    private Date atualizacao;
    @ElementList(name = "previsao", inline = true, required = false)
    private List<Previsao> previsaoList;

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

    public Date getAtualizacao() {
        return atualizacao;
    }

    public void setAtualizacao(Date atualizacao) {
        this.atualizacao = atualizacao;
    }

    public List<Previsao> getPrevisaoList() {
        return previsaoList;
    }

    public void setPrevisaoList(List<Previsao> previsaoList) {
        this.previsaoList = previsaoList;
    }
}