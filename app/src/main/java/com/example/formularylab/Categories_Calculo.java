package com.example.formularylab;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Categories_Calculo extends AppCompatActivity implements Fragment_Derivar.OnFragmentInteractionListener {

    TextView tv1;
    Fragment_Derivar fragment_derivar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories__calculo);
        fragment_derivar= new Fragment_Derivar();
        //Recibimos valor escogido en el TextView Principal
        tv1=(TextView) findViewById(R.id.tv_Cal);
        Bundle miBundle= this.getIntent().getExtras();
        int seleccion=miBundle.getInt("Options_selected");
            tv1.setText("Esoogio: "+seleccion);
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
            switch (seleccion){
                case 1:
                    transaction.add(R.id.frame_fragments,fragment_derivar);
                    break;
            }
            transaction.commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
