package com.exercicio.hqzatorre.previsaodotempo;

import android.app.Activity;
import android.os.Bundle;

import com.exercicio.hqzatorre.previsaodotempo.connections.InpeApiHelper;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InpeApiHelper apiHelper = new InpeApiHelper(this);
        apiHelper.listaCidades();
    }
}
