package com.exercicio.hqzatorre.previsaodotempo.models;

/**
 * Created by lab on 6/8/17.
 * enum de UF com capitais e do id IBGE copiado de:
 * https://github.com/caelum/caelum-stella/blob/master/stella-nfe/src/main/java/br/com/caelum/stella/nfe/Estados.java
 */

public enum Estado {
    RO(11, "Rondônia"),
    AC(12, "Acre"),
    AM(13, "Amazonas"),
    RR(14, "Roraima"),
    PA(15, "Pará"),
    AP(16, "Amapá"),
    TO(17, "Tocantins"),
    MA(21, "Maranhão"),
    PI(22, "Piauí"),
    CE(23, "Ceará"),
    RN(24, "Rio Grande do Norte"),
    PB(25, "Paraíba"),
    PE(26, "Pernambuco"),
    AL(27, "Alagoas"),
    SE(28, "Sergipe"),
    BA(29, "Bahia"),
    MG(31, "Minas Gerais"),
    ES(32, "Espírito Santo"),
    RJ(33, "Rio de Janeiro"),
    SP(35, "São Paulo"),
    PR(41, "Paraná"),
    SC(42, "Santa Catarina"),
    RS(43, "Rio Grande do Sul"),
    MS(50, "Mato Grosso do Sul"),
    MT(51, "Mato Grosso"),
    GO(52, "Goiás"),
    DF(53, "Distrito Federal");

    private final int codigoIbge;
    private final String nome;

    Estado(int codigoIbge, String nome) {
        this.codigoIbge = codigoIbge;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigoIbge;
    }


    public String getNome() {
        return nome;
    }

    public int getCodigoIbge() {
        return codigoIbge;
    }

    /**
     *
     * @param idIbge id segundo ibge do estado.
     * @return Estado
     */
    public Estado fromIdIbge(int idIbge) {
        for (Estado estado : Estado.values()) {
            if (estado.getCodigo() == idIbge) {
                return estado;
            }
        }
        return null;
    }

    /**
     * @param nome por extenso do estado eg: "Mato Grosso"
     * @return Estado
     */
    public Estado fromNome(String nome) {
        for (Estado estado : Estado.values()) {
            if (estado.getNome().toUpperCase().equals(nome.toUpperCase())) {
                return estado;
            }
        }
        return null;
    }

    /**
     * @param string valor em string do enum eg: "AC"
     * @return Estado
     */
    public Estado fromEnumString(String string) {
        for (Estado estado : Estado.values()) {
            if (estado.name().equals(string)) {
                return estado;
            }
        }
        return null;
    }
}