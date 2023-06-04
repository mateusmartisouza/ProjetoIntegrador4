package com.example.appsistemadasade;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Tela5 extends AppCompatActivity {

    private Button botao1,  botao11, botao12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_tela5 );

        botao1 = findViewById( R.id.button1 );
        botao11 = findViewById( R.id.button11 );
        botao12 = findViewById( R.id.button12 );

        botao1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( getApplicationContext(), Tela13.class);
                startActivity( intent );
            }
        } );

        botao11.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( getApplicationContext(), Tela11.class );
                startActivity( intent );
            }
        } );

        botao12.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( getApplicationContext(), Tela10.class );
                startActivity( intent );
            }
        } );
    }
}
