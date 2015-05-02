package com.example.lucas.easyride;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.example.lucas.easyride.Model.Usuario;


public class CadastroUsuario extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cadastro_usuario, menu);
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

    /*
    public boolean EmailValido(String email) {

        return email.contains("@");
    }

    public boolean SenhaValida(String password) {

        return password.length() > 8;
    }
*/
    public void cadastraUsuario (View v){
        DbHelper Helper = new DbHelper(this);

        EditText email = (EditText) findViewById(R.id.name);
        EditText password = (EditText) findViewById(R.id.email);
        EditText whatsapp = (EditText) findViewById(R.id.whatsapp);

        Usuario user = new Usuario(email.getText().toString(), password.getText().toString(), whatsapp.getText().toString());



        // INSERE O USUARIO NO BANCO DE DADOS

        Helper.insertUsuario(user);
        Global.usuarios.add(user);
        Intent i = new Intent(this, LoginUsuario.class);
        startActivity(i);
    }
}
