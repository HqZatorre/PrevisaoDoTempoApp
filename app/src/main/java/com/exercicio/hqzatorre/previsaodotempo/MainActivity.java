package com.exercicio.hqzatorre.previsaodotempo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar data = Calendar.getInstance();
        TextView dataView = (TextView) findViewById(R.id.data);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy H:mm");
        dataView.setText(format.format(data.getTime()));

    }
}
