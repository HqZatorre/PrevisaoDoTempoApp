package com.exercicio.hqzatorre.previsaodotempo.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.exercicio.hqzatorre.previsaodotempo.R;
import com.exercicio.hqzatorre.previsaodotempo.adapters.CidadesAdapter;

public class MainActivity extends Activity {
    private CidadesAdapter cidadesAdapter;
    private ListView cidadesListView;
    private TextView temperatura;
    private TextView abreviacao;
    private TextView temperaturaDois;
    private TextView temperaturaTres;
    private TextView temperaturaQuatro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cidadesAdapter = new CidadesAdapter(this);
        cidadesListView = (ListView) findViewById(R.id.list_cidades);
        cidadesListView.setAdapter(cidadesAdapter);
        temperatura = (TextView) findViewById(R.id.temperatura);
        abreviacao = (TextView) findViewById(R.id.nome);
        final Button btnBusca = (Button) findViewById(R.id.btn_busca);
        final EditText txtBuscaCidade = (EditText) findViewById(R.id.txt_cidade);

        btnBusca.setOnClickListener(v -> {
            String cidadeBusca = txtBuscaCidade.getText() != null ? txtBuscaCidade.getText().toString() : "";
            cidadesAdapter.buscaCidade(cidadeBusca);
        });
    }

    public TextView getTemperatura() {
        return temperatura;
    }

    public TextView getNomeCidade() {
        return abreviacao;
    }
}
