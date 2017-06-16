package com.exercicio.hqzatorre.previsaodotempo.adapters;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.exercicio.hqzatorre.previsaodotempo.R;
import com.exercicio.hqzatorre.previsaodotempo.models.Previsao;

import java.util.List;

/**
 * Created by labiuai@gmail.com on 6/15/17.
 */

public class PrevisaoAdapter extends BaseAdapter implements ListAdapter {
    private final List<Previsao> previsaoList;
    private final Context context;

    public PrevisaoAdapter(Context context, List<Previsao> previsaoList) {
        this.previsaoList = previsaoList;
        this.context = context;
    }


    @Override
    public int getCount() {
        return previsaoList != null ? previsaoList.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return previsaoList != null && previsaoList.size() > position ? previsaoList.get(position) : null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            final LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(R.layout.previsao_list_item, parent, false);
        }
        final TextView dataTxt = (TextView) view.findViewById(R.id.txt_data);
        final TextView condicaoTxt = (TextView) view.findViewById(R.id.txt_condicao);
        final TextView minimaTxt = (TextView) view.findViewById(R.id.txt_minima);
        final TextView maximaTxt = (TextView) view.findViewById(R.id.txt_maxima);

        final Previsao previsao = (Previsao) getItem(position);
        dataTxt.setText(DateFormat.format("EEE", previsao.getDia()));
        condicaoTxt.setText(previsao.getTempo().getDescricao());
        minimaTxt.setText(String.valueOf(previsao.getMinima()));
        maximaTxt.setText(String.valueOf(previsao.getMaxima()));
        return view;
    }
}
