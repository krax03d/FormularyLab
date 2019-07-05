package com.example.formularylab;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.formularylab.Entidades.Formulas;
import com.example.formularylab.Utilidades.Utilidades;

import java.util.ArrayList;

public class Saved_Formulas extends AppCompatActivity {

    ListView ListViewFormulas;
    ArrayList <String> ListInformation;
    ArrayList <Formulas> ListFormulas;
    AdminSQLiteOpenHelper conn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved__formulas);
        ListViewFormulas=(ListView) findViewById(R.id.lv_saved_formulas);
        conn= new AdminSQLiteOpenHelper( getApplicationContext(),"db_formulas",null,1);
        ConsultBD();
        ArrayAdapter adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,ListInformation);
        ListViewFormulas.setAdapter(adapter);

    }

    private void ConsultBD() {
        SQLiteDatabase DataBase = conn.getReadableDatabase();
        Formulas formula=null;
        ListFormulas=new ArrayList<Formulas>();
        Cursor cursor = DataBase.rawQuery(" SELECT * FROM " +Utilidades.TABLA_FORMULAS,null);

        while(cursor.moveToNext()){
            formula=new Formulas();
            formula.setId(cursor.getInt(0));
            formula.setNombre(cursor.getString(1));
            ListFormulas.add(formula);
        }
        getList();
    }

    private void getList() {
        ListInformation=new ArrayList<String>();
        for(int i=0;i<ListFormulas.size();i++){
            ListInformation.add(ListFormulas.get(i).getId()+" - "+ListFormulas.get(i).getNombre());
        }
    }
}
