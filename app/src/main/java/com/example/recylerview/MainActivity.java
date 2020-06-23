package com.example.recylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    List<String> listaPeliculas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPeliculas = new ArrayList<>();
        listaPeliculas.add("La Momia");
        listaPeliculas.add("Harry Potter y el Caliz de Fuego");
        listaPeliculas.add("El señor de los anillos");
        listaPeliculas.add("Avengers Endgame");
        listaPeliculas.add("Midsommar");
        listaPeliculas.add("Chucky");
        listaPeliculas.add("Mujercitas");
        listaPeliculas.add("Incidious");
        listaPeliculas.add("Scary Movie");
        listaPeliculas.add("Scary Movie 2");

        recyclerView = findViewById(R.id.miVista);
        recyclerAdapter = new RecyclerAdapter(listaPeliculas);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerAdapter);
    }
}