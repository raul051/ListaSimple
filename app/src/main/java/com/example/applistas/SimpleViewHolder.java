package com.example.applistas;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SimpleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    private String elemento;
    private TextView item;
    private ArrayList<String> elementos;

    private static final String TAG = Adaptador.class.getSimpleName();

    public SimpleViewHolder(final View view, ArrayList<String> e){
        super(view);
        item = (TextView) view.findViewById(R.id.simple_text);
        elementos = e;
        view.setOnClickListener(this);
    }

    public void setElemento(String e){
        item.setText(e);
    }

    @Override
    public void onClick(View view) {
        int position = getAdapterPosition();
        elemento = elementos.get(position);
        Log.d(TAG, "onClick(), elemento: " + elemento + "posición: " + position);
    }
}
