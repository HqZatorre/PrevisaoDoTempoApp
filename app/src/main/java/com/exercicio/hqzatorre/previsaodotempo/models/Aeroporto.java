package com.exercicio.hqzatorre.previsaodotempo.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Wallace on 15/06/2017.
 * Classe para deserializar as informações atuais nas superfícies dos aeroportos
 * http://servicos.cptec.inpe.br/XML/#req-condicoes-capitais
 */
@Root(name="metar", strict=false)
public class Aeroporto {
    /*
      <metar>
      <codigo>SBAR</codigo>
      <atualizacao>15/06/2017 17:00:00</atualizacao>
      <pressao>1016</pressao>
      <temperatura>26</temperatura>
      <tempo>pn</tempo>
      <tempo_desc>Parcialmente Nublado</tempo_desc>
      <umidade>74</umidade>
      <vento_dir>140</vento_dir>
      <vento_int>17</vento_int>
      <intensidade>>10000</intensidade>
      </metar>
     */

    @Element(name="codigo")
    private CodigoAeroporto aeroporto;

    @Element(name="temperatura")
    private int temperatura;

    @Element(name="tempo")
    private Tempo tempo;

    public CodigoAeroporto getAeroporto() {
        return aeroporto;
    }

    public void setAeroporto(CodigoAeroporto aeroporto) {
        this.aeroporto = aeroporto;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public Tempo getTempo() {
        return tempo;
    }

    public void setTempo(Tempo tempo) {
        this.tempo = tempo;
    }
}
