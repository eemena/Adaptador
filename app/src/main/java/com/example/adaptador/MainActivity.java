package com.example.adaptador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView horario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //String [] titulos = getResources().getStringArray(R.array.horario_de_clases);
       //   ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,titulos);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.horario_de_clases,android.R.layout.simple_list_item_1);

        horario = findViewById(R.id.lista);
        horario.setAdapter(adapter);
    }
}
