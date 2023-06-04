package com.example.appsistemadasade;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Tela10 extends AppCompatActivity {

    private Button botao1, botao17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_tela10 );

        botao1 = findViewById( R.id.button1 );
        botao17 = findViewById( R.id.button17 );

        botao1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( getApplicationContext(), Tela13.class );
                startActivity( intent );
            }
        } );

        botao17.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( getApplicationContext(), Tela9.class );
                startActivity( intent );
            }
        } );

    }
}

