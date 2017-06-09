package com.exercicio.hqzatorre.previsaodotempo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

/**
 * Created by lab on 6/8/17.
 */
@JacksonXmlRootElement(localName = "cidades")
public class Cidades {

    /*
     <cidade>
      <nome>São Paulo</nome>
      <uf>SP</uf>
      <id>244</id>
    </cidade>
     */
    @JacksonXmlProperty(localName = "cidade")
    private List<Cidade> cidades;


}
