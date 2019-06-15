package com.example.formularylab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;
    private TextView tv1, tv2;
    private boolean PrimeraVez=true;
    private ListView ListTrigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView)findViewById(R.id.tvPrincipal);
        tv2 = (TextView)findViewById(R.id.tv2Principal);
        spinner1=(Spinner)findViewById(R.id.spinnerPrincipal);
        ListTrigo=(ListView)findViewById(R.id.lv_main);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.spinnerOpciones,R.layout.spinner_item_size);
        spinner1.setAdapter(adapter);
        //ArrayList<String>options_main=new ArrayList<String>();
        //options_main.add("Seleccione");
        //options_main.add("Calculo");
        //options_main.add("Fisica");
        //options_main.add("Trigonometria");
        //ArrayAdapter<CharSequence> adapterSpinner=new ArrayAdapter(this,android.R.layout.simple_spinner_item,options_main);
        //spinner1.setAdapter(adapterSpinner);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 1:

                        ArrayAdapter<CharSequence> adapterListView=ArrayAdapter.createFromResource(getApplicationContext(), R.array.Trigo_options,R.layout.listview_item_size);
                        ListTrigo.setAdapter(adapterListView);

                        break;

                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ListTrigo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent category= null;
                switch(position){
                    case 1:
                            category = new Intent(MainActivity.this,Categories.class);

                        break;

                }
            }
        });
    }
}
