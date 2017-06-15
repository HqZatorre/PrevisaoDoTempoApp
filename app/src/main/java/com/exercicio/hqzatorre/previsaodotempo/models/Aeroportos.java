package com.exercicio.hqzatorre.previsaodotempo.models;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;

/**
 * Created by Wallace on 15/06/2017.
 */
@Root(strict=false, name="capitais")
public class Aeroportos {

    @ElementList(inline=true)
    private ArrayList<Aeroporto> aeroportos;

    public ArrayList<Aeroporto> getAeroportos() {
        return aeroportos;
    }

    public void setAeroportos(ArrayList<Aeroporto> aeroportos) {
        this.aeroportos = aeroportos;
    }
}
