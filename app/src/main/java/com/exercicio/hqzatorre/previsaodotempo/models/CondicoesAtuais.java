package com.exercicio.hqzatorre.previsaodotempo.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by labiuai@gmail.com on 6/15/17.
 */
/*
 <metar>
     <codigo>SBGR</codigo>
     <atualizacao>08/08/2011 16:00:00</atualizacao>
     <pressao>1017</pressao>
     <temperatura>30</temperatura>
     <tempo>cl</tempo>
     <tempo_desc>Céu Claro</tempo_desc>
     <umidade>35</umidade>
     <vento_dir>300</vento_dir>
     <vento_int>18</vento_int>
     <visibilidade>>10000</visibilidade>
 </metar>
 */
@Root(name = "metar", strict = false)
public class CondicoesAtuais {
    @Element(name = "codigo", required = false)
    private Estacao estacao;
    @Element(required = false)
    private Integer pressao;
    @Element(required = false)
    private Integer temperatura;
    @Element(required = false)
    private Integer umidade;
    @Element(name = "vento_dir", required = false)
    private Integer ventoDirecao;
    @Element(name = "vent_int", required = false)
    private Integer ventoVelocidade;
    @Element(name = "visibilidade", required = false)
    private Integer visibilidadeMetros;
    @Element(required = false)
    private Tempo tempo;
    @Element(required = false)
    private String atualizacao;


    public Estacao getEstacao() {
        return estacao;
    }

    public void setEstacao(Estacao estacao) {
        this.estacao = estacao;
    }

    public Integer getPressao() {
        return pressao;
    }

    public void setPressao(Integer pressao) {
        this.pressao = pressao;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public Integer getUmidade() {
        return umidade;
    }

    public void setUmidade(Integer umidade) {
        this.umidade = umidade;
    }

    public Integer getVentoDirecao() {
        return ventoDirecao;
    }

    public void setVentoDirecao(Integer ventoDirecao) {
        this.ventoDirecao = ventoDirecao;
    }

    public Integer getVentoVelocidade() {
        return ventoVelocidade;
    }

    public void setVentoVelocidade(Integer ventoVelocidade) {
        this.ventoVelocidade = ventoVelocidade;
    }

    public Integer getVisibilidadeMetros() {
        return visibilidadeMetros;
    }

    public void setVisibilidadeMetros(Integer visibilidadeMetros) {
        this.visibilidadeMetros = visibilidadeMetros;
    }

    public Tempo getTempo() {
        return tempo;
    }

    public void setTempo(Tempo tempo) {
        this.tempo = tempo;
    }

    public String getAtualizacao() {
        return atualizacao;
    }

    public void setAtualizacao(String atualizacao) {
        this.atualizacao = atualizacao;
    }
}
