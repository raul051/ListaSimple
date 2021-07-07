package com.example.applistas;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.wear.widget.WearableRecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SimpleListActivity extends WearableActivity {

    private WearableRecyclerView lista_simple;
    private Adaptador adaptadorListaSimple;
    private String valorPorDefaul ="Elemento";
    private ArrayList<String> elemntos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);

        rellenar_lista();

        adaptadorListaSimple = new Adaptador(valorPorDefaul,elemntos);
        lista_simple = (WearableRecyclerView) findViewById(R.id.simple_recyclerview);

        lista_simple.setEdgeItemsCenteringEnabled(true);
        lista_simple.setLayoutManager(new LinearLayoutManager(this));
        lista_simple.setHasFixedSize(true);
        lista_simple.setAdapter(adaptadorListaSimple);

    }

    public void rellenar_lista(){
        //crear datos dumy
        elemntos = new ArrayList<String>();
        elemntos.add("Lunes");
        elemntos.add("Martes");
        elemntos.add("Miercoles");
        elemntos.add("Jueves");
        elemntos.add("Viernes");
        elemntos.add("Sabado");
        elemntos.add("Domingo");
    }
}