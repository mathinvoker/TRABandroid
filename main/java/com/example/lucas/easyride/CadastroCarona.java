package com.example.lucas.easyride;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.example.lucas.easyride.Model.Carona;

public class CadastroCarona extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_carona);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cadastro_carona, menu);
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

    public void cadastraCarona(View v){

        EditText departureCity = (EditText) findViewById(R.id.departureCity);
        EditText departureAddress = (EditText) findViewById(R.id.departureAddress);
        EditText destinationCity = (EditText) findViewById(R.id.destinationCity);
        EditText destinationAddress = (EditText) findViewById(R.id.destinationAddress);
        EditText date = (EditText) findViewById(R.id.date);
        EditText time = (EditText) findViewById(R.id.time);
        EditText seatsAvailable = (EditText) findViewById(R.id.seatsAvailable);

        Carona carona = new Carona(departureCity.getText().toString(), departureAddress.getText().toString(),
                destinationCity.getText().toString(), destinationAddress.getText().toString(),
                date.getText().toString(), time.getText().toString(), seatsAvailable.getText().toString());

        // INSERE NO BANCO

        // ADICIONAR MSG DE CONFIRMACAO DA INSERCAO

        Intent it = new Intent(this, TelaPrincipal.class);
        startActivity(it);
    }
}
