package com.example.formularylab;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {


    public AdminSQLiteOpenHelper(View.OnClickListener context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super((Context) context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase Database) {
        Database.execSQL("create table formulas(image text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase Database, int i, int i1) {

    }
}
