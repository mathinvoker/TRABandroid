package com.example.lucas.easyride;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListarCaronas extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_listar_caronas);

        // RECEBE O OBJT DA TELA ANTERIOR E PREENCHE A TELA

        String caronas [] = new String[] {"Carona 1", "Carona 2", "Carona 3", "Voltar"};
        ArrayAdapter<String> array = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, caronas);
        setListAdapter(array);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_listar_caronas, menu);
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

    public void back(View v){

        Intent it = new Intent(this, BuscarCarona.class);
        startActivity(it);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){

        int count = l.getAdapter().getCount();
        if(count-1==position){
            finish();
        }else {
            Intent it = new Intent(this, ExibirDetalhesCarona.class);
            it.putExtra("rideName", l.getItemIdAtPosition(position));
            startActivity(it);
        }
    }
}
