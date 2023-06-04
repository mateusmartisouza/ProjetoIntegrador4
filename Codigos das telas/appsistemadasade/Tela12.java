package com.example.appsistemadasade;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Tela12 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_tela12 );


        try {
            SQLiteDatabase bancoDados = openOrCreateDatabase( "app", MODE_PRIVATE, null );

            bancoDados.execSQL( "CREATE TABLE IF NOT EXISTS clientes(id INTEGER PRIMARY KEY AUTOINCREMENT, nome VARCHAR," +
                    " cpf INT(11)," +
                    " datanasc INT(8)," +
                    "email VARCHAR," +
                     "senha VARCHAR) "
                     );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}