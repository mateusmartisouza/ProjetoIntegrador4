package com.example.appsistemadasade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela1 extends AppCompatActivity {

    private Button botao1, botao4, botao5, botao6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_tela1 );

        botao1 = findViewById( R.id.button1 );
        botao4 = findViewById( R.id.button4 );
        botao5 = findViewById( R.id.button5 );
        botao6 = findViewById( R.id.button6 );


        botao1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( getApplicationContext(), Tela13.class );
                startActivity( intent );
            }
        } );

        botao4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( getApplicationContext(), Tela2.class );
                startActivity( intent );
            }
        } );

        botao5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( getApplicationContext(), Tela4.class );
                startActivity( intent );
            }
        } );

        botao6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( getApplicationContext(), Tela8.class );
                startActivity( intent );
            }
        } );
    }
}