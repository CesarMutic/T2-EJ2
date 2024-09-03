package com.utic.actividad02_2app;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;

    private String[] nombres = {"Samuel", "Valentina", "Santiago", "Alejandro", "Valeria", "Benjamin", "Gerardo", "Carlos", "David", "Sofia"};
    private String[] edades = {"18", "25", "32", "17", "24", "20", "27", "15", "19", "23"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        lv1 = findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item, nombres); // Corregido
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("La edad de " + nombres[i] + " es " + edades[i] + " años"); // Corregido
            }
        });
    }
}