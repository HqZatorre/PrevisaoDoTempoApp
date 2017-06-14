package com.exercicio.hqzatorre.previsaodotempo.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lab on 6/9/17.
 * para pegar lista de condicoes atuais por estacao meteorolocia de
 * http://servicos.cptec.inpe.br/XML/#req-estacoes-meteorologicas
 * http://servicos.cptec.inpe.br/XML/estacao/SBGR/condicoesAtuais.xml
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
public enum Aeroporto {
    SBTK("Tarauacá", Estado.AC),
    SBRB("Presidente Médici", Estado.AC),
    SBCZ("Internacional", Estado.AC),
    SBMO("Zumbi dos Palmares", Estado.AL),
    SBEG("Eduardo Gomes", Estado.AM),
    SBMN("Ponta Pelada", Estado.AM),
    SBMY("Manicoré", Estado.AM),
    SBTT("Tabatinga", Estado.AM),
    SBYA("Iuaretê", Estado.AM),
    SBUA("São Gabriel da Cachoeira", Estado.AM),
    SBTF("Tefé", Estado.AM),
    SBAM("Amapá", Estado.AP),
    SBMQ("Internacional", Estado.AP),
    SBOI("Oiapoque", Estado.AP),
    SBLP("Bom Jesus da Lapa", Estado.BA),
    SBCV("Caravelas", Estado.BA),
    SBIL("Jorge Amado", Estado.BA),
    SBLE("Chapada Diamantina", Estado.BA),
    SBUF("Paulo Afonso", Estado.BA),
    SBPS("Porto Seguro", Estado.BA),
    SBSV("Dep. Luís Eduardo Magalhães", Estado.BA),
    SBQV("Vitória da Conquista", Estado.BA),
    SBFZ("Pinto Martins", Estado.CE),
    SBJU("Cariri", Estado.CE),
    SBBR("Juscelino Kubitschek", Estado.DF),
    SBVT("Eurico Aguiar Salles", Estado.ES),
    SBAN("Anápolis", Estado.GO),
    SBGO("Santa Genoveva", Estado.GO),
    SBCI("Carolina", Estado.MA),
    SBIZ("Imperatriz", Estado.MA),
    SBSL("Mar. Cunha Machado", Estado.MA),
    SBAX("Araxá", Estado.MG),
    SBPR("Carlos Prates", Estado.MG),
    SBBQ("Barbacena", Estado.MG),
    SBBH("Pampulha", Estado.MG),
    SBCF("Tancredo Neves", Estado.MG),
    SBPC("Poços de Caldas", Estado.MG),
    SBUR("Uberaba", Estado.MG),
    SBUL("Uberlândia", Estado.MG),
    SBIP("Ipatinga", Estado.MG),
    SBJF("Francisco de Assis", Estado.MG),
    SBMK("Montes Claros", Estado.MG),
    SBVG("Varginha", Estado.MG),
    SBGV("Gov. Valadares", Estado.MG),
    SBCG("Internacional", Estado.MS),
    SBCR("Corumbá", Estado.MS),
    SBPP("Internacional", Estado.MS),
    SBAT("Alta Floresta", Estado.MT),
    SBBW("Barra do Garças", Estado.MT),
    SBCY("Marechal Rondon", Estado.MT),
    SBHT("Altamira", Estado.PA),
    SBBE("Val-de-Cans", Estado.PA),
    SBIH("Itaituba", Estado.PA),
    SBEK("Jacareacanga", Estado.PA),
    SBMA("Marabá", Estado.PA),
    SBCC("Cachimbó", Estado.PA),
    SBTB("Trombetas", Estado.PA),
    SBCJ("Carajás", Estado.PA),
    SBSN("Santarém", Estado.PA),
    SBTU("Tucuruí", Estado.PA),
    SBAA("Conceição do Araguaia", Estado.PA),
    SBKG("Pres. João Suassuna", Estado.PB),
    SBJP("Pres. Castro Pinto", Estado.PB),
    SBFN("Fernando de Noronha", Estado.PE),
    SBRF("Guararapes", Estado.PE),
    SBPL("Sen. Nilo Coelho", Estado.PE),
    SBPB("Dr. João Silva Filho", Estado.PI),
    SBTE("Sen. Petrônio Portella", Estado.PI),
    SBLO("Londrina", Estado.PR),
    SBFI("Cataratas", Estado.PR),
    SBBI("Bacacheri", Estado.PR),
    SBCT("Afonso Pena", Estado.PR),
    SBMG("Silvio Name Junior", Estado.PR),
    SBCB("Cabo Frio", Estado.RJ),
    SBAF("Afonsos", Estado.RJ),
    SBGL("Galeão", Estado.RJ),
    SBJR("Jacarepaguá", Estado.RJ),
    SBRJ("Santos Dumont", Estado.RJ),
    SBSC("Santa Cruz", Estado.RJ),
    SBME("Macaé", Estado.RJ),
    SBES("S. Pedro da Aldeia", Estado.RJ),
    SBCP("Bartolomeu Lysandro", Estado.RJ),
    SBMS("Dix-Sept Rosado", Estado.RN),
    SBNT("Augusto Severo", Estado.RN),
    SBGM("Guajará Mirim", Estado.RO),
    SBVH("Brigadeiro Camarão", Estado.RO),
    SBPV("Gov. Jorge Teixeira de Oliveira", Estado.RO),
    SBBV("Boa Vista", Estado.RR),
    SBBG("Bagé", Estado.RS),
    SBSM("Santa Maria", Estado.RS),
    SBPA("Salgado Filho", Estado.RS),
    SBPK("Pelotas", Estado.RS),
    SBCO("Canoas", Estado.RS),
    SBUG("Rubem Berta", Estado.RS),
    SBCH("Chapecó", Estado.SC),
    SBCM("Forquilinha", Estado.SC),
    SBFL("Hercílio Luz", Estado.SC),
    SBJV("Lauro Carneiro de Loyola", Estado.SC),
    SBNF("Min. Victor Konder", Estado.SC),
    SBAR("Santa Maria", Estado.SE),
    SBAU("Araçatuba", Estado.SP),
    SBBU("Bauru", Estado.SP),
    SBKP("Viracopos", Estado.SP),
    SBDN("Pres. Prudente", Estado.SP),
    SBRP("Leite Lopes", Estado.SP),
    SBSR("S. J. do Rio Preto", Estado.SP),
    SBYS("Fontenelle", Estado.SP),
    SBST("Base Aérea", Estado.SP),
    SBGP("Gavião Peixoto", Estado.SP),
    SBGW("Guaratinguetá", Estado.SP),
    SBGR("Guarulhos", Estado.SP),
    SBSJ("São J. dos Campos", Estado.SP),
    SBMT("Campo de Marte", Estado.SP),
    SBSP("Congonhas", Estado.SP),
    SBTA("Taubaté", Estado.SP),
    SBPJ("Palmas", Estado.TO),
    SBPN("Porto Nacional", Estado.TO);
    private final String cidade;
    private final Estado estado;

    Aeroporto(String cidade, Estado estado) {
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    /**
     * Para pegar aeroporto a partir do código
     *
     * @param codigo do aeroporto
     * @return Aeroporto
     */
    static public Aeroporto fromCodigo(String codigo) {
        for (Aeroporto aeroporto : Aeroporto.values()) {
            if (aeroporto.name().equals(codigo)) {
                return aeroporto;
            }
        }
        return null;
    }

    /**
     * Retornar lista de aeroporto para Estado.
     * @param estado Estado
     * @return aeroportoArrayList
     */
    static public List<Aeroporto> fromEstado(final Estado estado) {
        // não utilizar collect(Collectors.toList()) nem Arrays.stream() para manter compatibilidade com api < 21
        ArrayList<Aeroporto> aeroportoArrayList = new ArrayList<>();
        //noinspection SimplifyStreamApiCallChains
        Arrays.asList(Aeroporto.values()).stream().filter(a -> a.getEstado() == estado).forEach(aeroportoArrayList::add);
        return aeroportoArrayList;
    }
}
