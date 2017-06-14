package com.exercicio.hqzatorre.previsaodotempo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.exercicio.hqzatorre.previsaodotempo.R;
import com.exercicio.hqzatorre.previsaodotempo.connections.InpeApiHelper;
import com.exercicio.hqzatorre.previsaodotempo.models.Cidade;

import java.util.List;

/**
 * Created by lab on 6/13/17.
 */

public class CidadesAdapter extends BaseAdapter implements ListAdapter {
    private List<Cidade> cidadeList;
    private final Context context;

    public CidadesAdapter(Context context) {
        this.context = context;
        InpeApiHelper apiHelper = new InpeApiHelper(context);
        cidadeList = apiHelper.listaCidades();
    }


    @Override
    public int getCount() {
        return cidadeList != null ? cidadeList.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return cidadeList != null && cidadeList.size() > position ? cidadeList.get(position) : null;
    }

    @Override
    public long getItemId(int position) {
        return cidadeList != null && cidadeList.size() > position ? cidadeList.get(position).getId() : -1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            final LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(R.layout.cidade_list_item, parent, false);
        }

        final TextView cidadeNome = (TextView) view.findViewById(R.id.txt_cidade_nome);
        final TextView cidadeUf = (TextView) view.findViewById(R.id.txt_cidade_uf);

        Cidade cidade = (Cidade) getItem(position);
        if(cidade != null){
            cidadeNome.setText(cidade.getNome());
            cidadeUf.setText(cidade.getUf().name());
        }

        return view;
    }
}
