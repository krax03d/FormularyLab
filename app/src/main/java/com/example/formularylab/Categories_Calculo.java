package com.example.formularylab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Categories_Calculo extends AppCompatActivity {

    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories__calculo);

        //Recibimos valor escogido en el TextView Principal
        tv1=(TextView) findViewById(R.id.tv_Cal);
        Bundle miBundle= this.getIntent().getExtras();
        int seleccion=miBundle.getInt("Options_selected");
            tv1.setText("Esoogio: "+seleccion);

            switch (seleccion){
                case 1:

                    break;
            }

    }
}
