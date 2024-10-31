package com.arquitectura.crud_productos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class GestionSQLiteOpenHelper extends SQLiteOpenHelper {

    public GestionSQLiteOpenHelper(@Nullable Context context,
                                   @Nullable String name,
                                   @Nullable SQLiteDatabase.CursorFactory factory,
                                   int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        BaseDeDatos.execSQL("CREATE TABLE T_Articulos (codigo INTEGER PRIMARY KEY, nombre TEXT, precio REAL)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }

}
