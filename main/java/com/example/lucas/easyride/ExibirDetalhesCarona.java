package com.example.lucas.easyride;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class ExibirDetalhesCarona extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_detalhes_carona);

        Intent it = getIntent();
        String nomeCarona = it.getStringExtra("rideName");
        preencheTela(nomeCarona);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_exibir_detalhes_carona, menu);
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

    public void Voltar(View v){

        finish();
    }

    private void preencheTela(String nomeCarona){

        TextView departureCity = (TextView) findViewById(R.id.departureCity);
        TextView departureAddress = (TextView) findViewById(R.id.departureAddress);
        TextView destinationCity = (TextView) findViewById(R.id.destinationCity);
        TextView destinationAddress = (TextView) findViewById(R.id.destinationAddress);
        TextView date = (TextView) findViewById(R.id.date);
        TextView time = (TextView) findViewById(R.id.time);
        TextView seatsAvailable = (TextView) findViewById(R.id.seatsAvailable);

        departureCity.setText("Viçosa");
        departureAddress.setText("Calçadão");
        destinationCity.setText("Belo Horizonte");
        destinationAddress.setText("Praça Tiradentes");
        date.setText("01/05/2015");
        time.setText("14:00");
        seatsAvailable.setText("2");
    }
}
