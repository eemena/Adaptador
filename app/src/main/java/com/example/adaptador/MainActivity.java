package com.example.adaptador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.adaptador.adapter.DiaHorarioAdapter;
import com.example.adaptador.modelo.DiaHorario;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView horario;
    private ArrayList<DiaHorario> lista;
    private TextView opcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] titulos = getResources().getStringArray(R.array.horario_de_clases);
        String[] subtitulos = getResources().getStringArray(R.array.dias_semana);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,titulos);
        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.horario_de_clases,android.R.layout.simple_list_item_1);

        lista = new ArrayList<>();
        for (int i=0; i<titulos.length; i++){
            lista.add(new DiaHorario(titulos[i], subtitulos[i]));
        }

        DiaHorarioAdapter adapter = new DiaHorarioAdapter(this,lista);

        opcion = findViewById(R.id.opcion);
        horario = findViewById(R.id.lista);
        horario.setAdapter(adapter);

        horario.setOnItemClickListener(new OnItemClickListener() {
                                           @Override
                                           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                               opcion.setText("Opcion: " + titulos[i]);
                                           }
                                       }

        );{

        }
    }
}
