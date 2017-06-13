package com.exercicio.hqzatorre.previsaodotempo.models;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by Wallace on 13/06/2017.
 */

@Root
public class Cidades {

    @ElementList(inline=true)
    List<Cidade> cidades;

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }
}
