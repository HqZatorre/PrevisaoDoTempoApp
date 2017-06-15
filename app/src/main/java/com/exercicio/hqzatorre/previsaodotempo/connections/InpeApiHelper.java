package com.exercicio.hqzatorre.previsaodotempo.connections;

import android.content.Context;

import com.exercicio.hqzatorre.previsaodotempo.R;
import com.exercicio.hqzatorre.previsaodotempo.models.Aeroporto;
import com.exercicio.hqzatorre.previsaodotempo.models.Aeroportos;
import com.exercicio.hqzatorre.previsaodotempo.models.Cidade;
import com.exercicio.hqzatorre.previsaodotempo.models.Cidades;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.util.List;

/**
 * Created by lab on 6/12/17.
 * métodos para acessar a api do Inpe de previsão do tempo: http://servicos.cptec.inpe.br/XML/
 */

public class InpeApiHelper {
    private final Context context;

    public InpeApiHelper(Context context) {
        this.context = context;
    }

    public List<Cidade> listaCidades() {
        String response = null;
        try {
            HttpHelper httpHelper = new HttpHelper();
            response = httpHelper.getHtmlString(context.getString(R.string.api_cidades));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (response != null) {
            Cidades cidades = (Cidades) parseXML(Cidades.class, response);
            return cidades != null ? cidades.getCidades() : null;
        }
        return null;
    }

    public List<Aeroporto> situacaoAtualAeroportos(){
        String response = null;
        try{
            HttpHelper httpHelper = new HttpHelper();
            response = httpHelper.getHtmlString(context.getString(R.string.api_aeroportos));
        }catch(Exception ex){
            ex.printStackTrace();
        }
        if(response != null){
            Aeroportos aeroportos = (Aeroportos) parseXML(Aeroportos.class, response);
            return aeroportos != null ? aeroportos.getAeroportos() : null;
        }
        return null;
    }

    public Cidade previsaoDoTempo(int codigoCidade){
        String response = null;
        try{
            HttpHelper httpHelper = new HttpHelper();
            String urltoRead = String.format(context.getString(R.string.api_previsao), codigoCidade);
            response = httpHelper.getHtmlString(urltoRead);
        } catch(Exception ex){
            ex.printStackTrace();
        }
        if(response != null){
            Cidade cidade = (Cidade) parseXML(Cidade.class, response);
            return cidade != null ? cidade : null;
        }
        return null;
    }

    static private Object parseXML(Class _class, String source) {
        try {

            Serializer serializer = new Persister();
            return serializer.read(Class.forName(_class.getName()) , source);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
