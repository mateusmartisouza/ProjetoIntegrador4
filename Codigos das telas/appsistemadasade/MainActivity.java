package com.example.appsistemadasade;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafetyNet;
import com.google.android.gms.safetynet.SafetyNetApi;

public class MainActivity extends AppCompatActivity implements GoogleApiClient.ConnectionCallbacks {

    CheckBox checkBox;
    GoogleApiClient googleApiClient;
    String SiteKey = "6LfIKyMmAAAAAPMZUGOTSY4ZOfRiwb1z4QFIGUIR";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        checkBox = findViewById( R.id.CheckBox_Id );


        googleApiClient = new GoogleApiClient.Builder( this )
                .addApi( SafetyNet.API )
                .addConnectionCallbacks( MainActivity.this)
                .build();
        googleApiClient.connect();

        checkBox.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox.isChecked()) {
                    SafetyNet.SafetyNetApi.verifyWithRecaptcha( googleApiClient, SiteKey )
                            .setResultCallback( new ResultCallback<SafetyNetApi.RecaptchaTokenResult>() {
                                @Override
                                public void onResult(@NonNull SafetyNetApi.RecaptchaTokenResult recaptchaTokenResult) {


                                    Status status = recaptchaTokenResult.getStatus();

                                    if ((status != null) && status.isSuccess()) {
                                        Toast.makeText( MainActivity.this, "Verificação bem Sucedida",
                                                Toast.LENGTH_SHORT ).show();
                                        checkBox.setTextColor( Color.BLUE );
                                    }

                                }
                            } );
                }else {
                    checkBox.setTextColor( Color.RED );
                    Toast.makeText( MainActivity.this, "Verificação Invalida", Toast.LENGTH_SHORT ).show();
                }
            }
        } );

    }

    @Override
    public void onConnected(@Nullable Bundle bundle){

    }

    @Override
    public void onConnectionSuspended(int i){

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
