package com.example.appsistemadasade;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Tela4 extends AppCompatActivity {

    private Button botao1, botao13, botao14, botao15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_tela4 );

        botao1 = findViewById( R.id.button1 );
        botao13 = findViewById( R.id.button13 );
        botao14 = findViewById( R.id.button14 );
        botao15 = findViewById( R.id.button15 );


        botao1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( getApplicationContext(), Tela13.class );
                startActivity( intent );
            }
        } );

        botao13.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( getApplicationContext(), Tela5.class );
                startActivity( intent );
            }
        } );

        botao14.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( getApplicationContext(), Tela6.class );
                startActivity( intent );
            }
        } );

        botao15.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( getApplicationContext(), Tela7.class );
                startActivity( intent );
            }
        } );
    }
}
