package com.example.applistas;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.wear.widget.WearableRecyclerView;

import java.util.ArrayList;

import static android.util.Log.d;

public class Adaptador extends WearableRecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<String> elementos;
    private String valorPorDefault;
    private static final String TAG = Adaptador.class.getSimpleName();

    public Adaptador(String d, ArrayList<String> e){
        valorPorDefault = d;
        elementos = e;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = new SimpleViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_layout,
                parent, false),elementos);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        String elemento = elementos.get(position);
        Log.d(TAG,"elemento en onBind: " + elemento);
        SimpleViewHolder elementoViewHolder = (SimpleViewHolder) viewHolder;
        elementoViewHolder.setElemento(elemento);

    }

    @Override
    public int getItemCount() {
        return elementos.size();
    }
}
