package com.example.formularylab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;
    private TextView tv1, tv2;
    private boolean PrimeraVez=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView)findViewById(R.id.tvPrincipal);
        tv2 = (TextView)findViewById(R.id.tv2Principal);
        spinner1=(Spinner)findViewById(R.id.spinnerPrincipal);


        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.spinnerOpciones,R.layout.spinner_item_size);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Intent seleccion = null;
                switch(position){
                    case 1:
                       Toast.makeText(getApplicationContext(),"Escogiste Calculo",Toast.LENGTH_LONG).show();
                        break;

                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
