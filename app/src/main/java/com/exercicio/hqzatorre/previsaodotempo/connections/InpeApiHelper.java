package com.exercicio.hqzatorre.previsaodotempo.connections;

import android.content.Context;

import com.exercicio.hqzatorre.previsaodotempo.R;
import com.exercicio.hqzatorre.previsaodotempo.models.Cidade;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

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
        Future<String> future = null;
        try {
            future = HttpHelper.getHTML(context.getString(R.string.api_cidades));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            response = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        if (response != null) {
            InputSource inputSource = new InputSource();
            inputSource.setByteStream(new ByteArrayInputStream(response.getBytes(StandardCharsets.UTF_8)));
            Document document = parseXML(inputSource);
            System.out.println(document);

            NodeList cidades = document.getElementsByTagName("cidades");
            for (int i = 0; i < cidades.getLength(); i++) {
                Cidade cidade = new Cidade();
                cidades.item(i);
                System.out.println(cidades.item(i).toString());
            }
        }
        return null;
    }

    static public Document parseXML(InputSource source) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(false);
            dbf.setValidating(false);
            DocumentBuilder db = dbf.newDocumentBuilder();
            return db.parse(source);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
