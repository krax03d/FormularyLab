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

public class MainActivity extends AppCompatActivity {
    private int seleccion_subcategory;
    private int seleccion_category;
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
                seleccion_category=position;
                //Intent category=null;
                //Bundle miBundle_category=new Bundle();
                switch(position){
                    case 0:
                       // Toast.makeText(getApplicationContext(),"Seleccione Alguna Opción",Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                       // miBundle_category.putInt("Selected_Category",seleccion_category);
                        //category.putExtras(miBundle_category);
                        ArrayAdapter<CharSequence> adapterListView_Calcu=ArrayAdapter.createFromResource(getApplicationContext(), R.array.Calcu_options,R.layout.listview_item_size);
                        ListTrigo.setAdapter(adapterListView_Calcu);
                        //Toast.makeText(getApplicationContext(),"Selecciono 1",Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        //miBundle_category.putInt("Selected_Category",seleccion_category);
                        //category.putExtras(miBundle_category);
                        //Toast.makeText(getApplicationContext(),"Selecciono 2",Toast.LENGTH_LONG).show();
                        ArrayAdapter<CharSequence> adapterListView_Fisica=ArrayAdapter.createFromResource(getApplicationContext(), R.array.Fisica_options,R.layout.listview_item_size);
                        ListTrigo.setAdapter(adapterListView_Fisica);

                        break;
                    case 3:
                        //miBundle_category.putInt("Selected_Category",seleccion_category);
                        //category.putExtras(miBundle_category);
                        //Toast.makeText(getApplicationContext(),"Selecciono 3",Toast.LENGTH_LONG).show();
                        ArrayAdapter<CharSequence> adapterListView_Trigo=ArrayAdapter.createFromResource(getApplicationContext(), R.array.Trigo_options,R.layout.listview_item_size);
                        ListTrigo.setAdapter(adapterListView_Trigo);
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
                seleccion_subcategory=position;

                Intent sub_categories=null;
                Bundle miBundle_subcategory=new Bundle();

                switch (seleccion_subcategory){
                    case 0:
                       // Toast.makeText(getApplicationContext(),"Selecciono la opcion 0",Toast.LENGTH_LONG).show();
                        sub_categories=new Intent(MainActivity.this, Categories_One.class);

                        miBundle_subcategory.putInt("Selected_Subcategory",seleccion_subcategory);
                        miBundle_subcategory.putInt("Selected_Category",seleccion_category);
                        sub_categories.putExtras(miBundle_subcategory);

                        startActivity(sub_categories);
                        break;
                    case 1:
                      //  Toast.makeText(getApplicationContext(),"Selecciono la opcion 1",Toast.LENGTH_LONG).show();
                        sub_categories=new Intent(MainActivity.this, Categories_One.class);
                       miBundle_subcategory.putInt("Selected_Subcategory",seleccion_subcategory);
                        miBundle_subcategory.putInt("Selected_Category",seleccion_category);
                        sub_categories.putExtras(miBundle_subcategory);



                        startActivity(sub_categories);
                        break;
                    case 2:
                        //Toast.makeText(getApplicationContext(),"Selecciono la opcion 2",Toast.LENGTH_LONG).show();
                        sub_categories=new Intent(MainActivity.this, Categories_One.class);
                        miBundle_subcategory.putInt("Selected_Subcategory",seleccion_subcategory);
                        miBundle_subcategory.putInt("Selected_Category",seleccion_category);
                        sub_categories.putExtras(miBundle_subcategory);


                        startActivity(sub_categories);
                        break;
                }

            }
        });

    }
}
