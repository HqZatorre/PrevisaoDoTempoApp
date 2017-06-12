package com.exercicio.hqzatorre.previsaodotempo.connections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Created by lab on 6/12/17.
 * copiado de: https://stackoverflow.com/a/1485730
 */

public class HttpHelper {
    public static Future<String> getHTML(final String urlToRead) throws Exception {
        return new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                StringBuilder result = new StringBuilder();
                URL url = new URL(urlToRead);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String line;
                while ((line = rd.readLine()) != null) {
                    result.append(line);
                }
                rd.close();
                return result.toString();
            }
        });
    }
}
