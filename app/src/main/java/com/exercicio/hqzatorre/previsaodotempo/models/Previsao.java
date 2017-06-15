package com.exercicio.hqzatorre.previsaodotempo.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Wallace on 15/06/2017.
 */

@Root(strict=false)
public class Previsao {
    /*
    <previsao>
        <dia>2017-06-16</dia>
        <tempo>ps</tempo>
        <maxima>22</maxima>
        <minima>12</minima>
        <iuv>5.0</iuv>
    </previsao>
     */
    @Element
    private Tempo tempo;
    @Element(name="maxima")
    private String temperaturaMaxima;
    @Element(name="minima")
    private String temperaturaMinima;

    public Tempo getTempo() {
        return tempo;
    }

    public void setTempo(Tempo tempo) {
        this.tempo = tempo;
    }

    public String getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(String temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public String getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(String temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }
}
