package com.exercicio.hqzatorre.previsaodotempo.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.Date;

/**
 * Created by labiuai@gmail.com on 6/15/17.
 */
/*
 <previsao>
        <dia>2011-08-10</dia>
        <tempo>n</tempo>
        <maxima>18</maxima>
        <minima>15</minima>
        <iuv>6.0</iuv>
    </previsao>
 */
@Root(name = "previsao", strict = false)
public class Previsao {
    @Element
    private Date dia;
    @Element
    private Tempo tempo;
    @Element
    private Integer maxima;
    @Element
    private Integer minima;
    @Element
    private Float iuv;

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public Tempo getTempo() {
        return tempo;
    }

    public void setTempo(Tempo tempo) {
        this.tempo = tempo;
    }

    public Integer getMaxima() {
        return maxima;
    }

    public void setMaxima(Integer maxima) {
        this.maxima = maxima;
    }

    public Integer getMinima() {
        return minima;
    }

    public void setMinima(Integer minima) {
        this.minima = minima;
    }

    public Float getIuv() {
        return iuv;
    }

    public void setIuv(Float iuv) {
        this.iuv = iuv;
    }
}
