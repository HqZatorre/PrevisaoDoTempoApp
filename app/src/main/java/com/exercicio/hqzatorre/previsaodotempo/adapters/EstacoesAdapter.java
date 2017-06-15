package com.exercicio.hqzatorre.previsaodotempo.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

import com.exercicio.hqzatorre.previsaodotempo.connections.InpeApiHelper;
import com.exercicio.hqzatorre.previsaodotempo.models.Estacao;

import java.util.List;

/**
 * Created by labiuai@gmail.com on 6/15/17.
 */

public class EstacoesAdapter extends BaseAdapter implements ListAdapter {
    private final List<Estacao> estacoes;
    private final Context context;
    private final InpeApiHelper inpeApiHelper;

    public EstacoesAdapter(List<Estacao> estacoes, Context context) {
        this.estacoes = estacoes;
        this.context = context;
        this.inpeApiHelper = new InpeApiHelper(context);
    }

    @Override
    public int getCount() {
        return estacoes.size();
    }

    @Override
    public Object getItem(int position) {
        return estacoes.size() > position ? estacoes.get(position) : null;
    }

    @Override
    public long getItemId(int position) {
        return estacoes.size() > position ? estacoes.get(position).ordinal() : -1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
