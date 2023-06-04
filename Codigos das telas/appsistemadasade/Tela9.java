package com.example.appsistemadasade;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Tela9 extends AppCompatActivity {

    private Button botao1, botao16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_tela9 );

        botao1 = findViewById( R.id.button1 );
        botao16 = findViewById( R.id.button16 );

        botao1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( getApplicationContext(), Tela13.class );
                startActivity( intent );
            }
        } );

        botao16.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( getApplicationContext(), MainActivity.class );
                startActivity( intent );
            }
        } );
    }
}
