package com.salmon.el.taquito;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;


public class PrincAct extends Activity {

    // Variable constante para asignar el tiempo del thread
    private static final long SPLASH_SCREEN_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Se define la orientacion de la pantalla
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // Oculta el la barra de notificaciones
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_princ);

        /*
            Thread que hace el cambio a la actividad principal
         */
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                // Hace el cambio de actividades.
                Intent mainIntent = new Intent().setClass(
                        PrincAct.this, Login.class);
                startActivity(mainIntent);

                //Cerramos la actividad para que el usuario no pueda regresar
                finish();
            }
        };

        // Timer para lograr hacer el cambio.
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY);
    }

}