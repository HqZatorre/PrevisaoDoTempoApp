package com.exercicio.hqzatorre.previsaodotempo.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

import com.exercicio.hqzatorre.previsaodotempo.connections.InpeApiHelper;
import com.exercicio.hqzatorre.previsaodotempo.models.Aeroporto;

import java.util.List;

/**
 * Created by labiuai@gmail.com on 6/15/17.
 */

public class AeroportosAdapter extends BaseAdapter implements ListAdapter {
    private final List<Aeroporto> aeroportos;
    private final Context context;
    private final InpeApiHelper inpeApiHelper;

    public AeroportosAdapter(List<Aeroporto> aeroportos, Context context) {
        this.aeroportos = aeroportos;
        this.context = context;
        this.inpeApiHelper = new InpeApiHelper(context);
    }

    @Override
    public int getCount() {
        return aeroportos.size();
    }

    @Override
    public Object getItem(int position) {
        return aeroportos.size() > position ? aeroportos.get(position) : null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
