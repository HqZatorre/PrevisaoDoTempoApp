package com.exercicio.hqzatorre.previsaodotempo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.exercicio.hqzatorre.previsaodotempo.models.CidadesAdapter;

public class MainActivity extends Activity {
    private CidadesAdapter cidadesAdapter;
    private ListView cidadesListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cidadesAdapter = new CidadesAdapter(this);
        cidadesListView = (ListView) findViewById(R.id.list_cidades);
        cidadesListView.setAdapter(cidadesAdapter);
    }
}
