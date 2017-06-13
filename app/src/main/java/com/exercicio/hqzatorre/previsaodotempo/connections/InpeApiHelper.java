package com.exercicio.hqzatorre.previsaodotempo.connections;

import android.content.Context;

import com.exercicio.hqzatorre.previsaodotempo.R;
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
            Cidades cidades = parseXMLCidades(response);
            return cidades != null ? cidades.getCidades() : null;
        }
        return null;
    }

    static private Cidades parseXMLCidades(String source) {
        try {
            Serializer serializer = new Persister();
            return serializer.read(Cidades.class, source);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
