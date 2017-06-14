package com.exercicio.hqzatorre.previsaodotempo;

import android.app.Activity;
import android.os.Bundle;

import com.exercicio.hqzatorre.previsaodotempo.connections.InpeApiHelper;
import com.exercicio.hqzatorre.previsaodotempo.models.Cidade;

import java.util.List;

public class MainActivity extends Activity {

    private List<Cidade> cidadeList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InpeApiHelper apiHelper = new InpeApiHelper(this);

        cidadeList = apiHelper.listaCidades();
    }
}
