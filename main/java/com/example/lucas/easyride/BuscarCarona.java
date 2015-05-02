package com.example.lucas.easyride;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.example.lucas.easyride.Model.Carona;


public class BuscarCarona extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_carona);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_buscar_carona, menu);
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

    public void buscarCarona(View v){

        EditText origin = (EditText) findViewById(R.id.departureCity);
        EditText destiny = (EditText) findViewById(R.id.departureAddress);
        EditText date = (EditText) findViewById(R.id.date);
        EditText time = (EditText) findViewById(R.id.destinationAddress);

        /*Carona carona = new Carona(origin.getText().toString(), destiny.getText().toString(),
                date.getText().toString(), time.getText().toString());*/

        // PESQUISA NO BANCO

        // ENVIA RESULTADO PARA A PROXIMA TELA

        Intent it = new Intent(this, ListarCaronas.class);
        startActivity(it);
    }
}
