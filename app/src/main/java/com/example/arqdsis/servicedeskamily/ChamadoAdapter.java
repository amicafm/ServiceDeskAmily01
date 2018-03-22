package com.example.arqdsis.servicedeskamily;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.text.SimpleDateFormat;
import java.util.List;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by arqdsis on 21/03/2018.
 */

public class ChamadoAdapter <T> extends BaseAdapter{

    private List<T> chamados;
    private Context context;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

    public ChamadoAdapter (Context context, List <T> chamados){
        this.chamados = chamados;
        this.context = context;
    }

    @Override
    public int getCount() {
        return chamados.size();
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.linha_chamado, viewGroup, false);
        ImageView iconeImageView = convertView.findViewById(R.id.iconeImageView);
        TextView descricaoTextView = convertView.findViewById(R.id.descricaoTextView);
        TextView dataAberturaTextView = convertView.findViewById(R.id.dataAberturaTextView);
        TextView dataFechamentoTextView = convertView.findViewById(R.id.dataFechamentoTextView);
        Chamado chamado = (Chamado)getItem(i);
        iconeImageView.setImageDrawable(Util.getDrawable(Activity) context, chamado.getFila().getIcone());
        descricaoTextView.setText(chamado.getDescricao());
        dataAberturaTextView.setText(sdf.format(chamado.getDataAbertura());
        if(chamado.getDataFechamento() != null){
            dataFechamentoTextView.setText(sdf.format(chamado.getDataFechamento()));
        }
        return convertView;
    }

    @Override
    public T getItem(int i) {
        return chamados.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
}
