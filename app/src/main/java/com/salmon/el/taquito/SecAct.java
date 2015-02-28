package com.salmon.el.taquito;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class SecAct extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sec, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void CheckIn(View v){
        Intent checkIn = new Intent(SecAct.this,CheckIn.class);
        startActivity(checkIn);
    }

    public void BusCar(View v){
        Intent busCar = new Intent(SecAct.this,BusCar.class);
        startActivity(busCar);
    }

    public void AmiGos(View v){
        Intent amiGos = new Intent(SecAct.this,AmiGos.class);
        startActivity(amiGos);
    }

    public void PerFil(View v){
        Intent perFil = new Intent(SecAct.this,PerFil.class);
        startActivity(perFil);
    }
}
