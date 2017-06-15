package com.exercicio.hqzatorre.previsaodotempo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.exercicio.hqzatorre.previsaodotempo.R;
import com.exercicio.hqzatorre.previsaodotempo.activities.MainActivity;
import com.exercicio.hqzatorre.previsaodotempo.connections.InpeApiHelper;
import com.exercicio.hqzatorre.previsaodotempo.models.Cidade;

import java.util.List;

/**
 * Created by labiuai@gmail.com on 6/13/17.
 */

public class CidadesAdapter extends BaseAdapter implements ListAdapter {
    private List<Cidade> cidadeList;
    private ListView previsoesListView;
    private final Context context;
    private final InpeApiHelper inpeApiHelper;

    public CidadesAdapter(Context context) {
        this.context = context;
        inpeApiHelper = new InpeApiHelper(context);
        cidadeList = inpeApiHelper.listaCidades();
        previsoesListView = (ListView) ((MainActivity) context).findViewById(R.id.list_previsoes);
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

        final TextView txtCidadeNome = (TextView) view.findViewById(R.id.txt_cidade_nome);
        final TextView txtCidadeUf = (TextView) view.findViewById(R.id.txt_cidade_uf);

        Cidade cidade = (Cidade) getItem(position);
        if (cidade != null) {
            txtCidadeNome.setText(cidade.getNome());
            txtCidadeUf.setText(cidade.getUf().name());
        }

        // quando uma cidade for selecionada busca a previsao de quatro dias.
        view.setOnClickListener(v -> {
            try {
                Cidade cidadeTmp = inpeApiHelper.fetchPrevisaoQuatroDias((Cidade) getItem(position));
                ((MainActivity) context).getNomeCidade().setText(cidadeTmp.getNome());
                PrevisaoAdapter previsaoAdapter = new PrevisaoAdapter(context, cidadeTmp.getPrevisaoList());
                previsoesListView.setAdapter(previsaoAdapter);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return view;
    }

    public void buscaCidade(String nomeCidade) {
        cidadeList = inpeApiHelper.buscaCidade(nomeCidade);
        notifyDataSetChanged();
    }
}
