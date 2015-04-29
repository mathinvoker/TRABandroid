package com.praticas.matheus.easyride;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper{

    private static final String NOME_BD = "UsuarioBD";
    private static final int VERSAO_BD = 1;

    public DbHelper(Context context) {
        super(context, NOME_BD, null, VERSAO_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQLCreateTableUsuario = "CREATE TABLE Usuario(" +
                "idUsuario INTEGER PRIMARY KEY AUTOINCREMENT," +
                "email VARCHAR(150)," +
                "senha VARCHAR(15)," +
                "whatsapp VARCHAR(30)" +
                ")";
        db.execSQL(SQLCreateTableUsuario);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String SQLDropTableUsuario = "DROP TABLE Usuario";
        db.execSQL(SQLDropTableUsuario);

        onCreate(db);
    }

    public void reset (){
        SQLiteDatabase db = getWritableDatabase();
        String SQLDropTableUsuario = "DROP TABLE Usuario";
        db.execSQL(SQLDropTableUsuario);

        onCreate(db);
    }

    public void insertUsuario(Usuario f){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("email", f.getEmail());
        cv.put("senha", f.getPassword());
        cv.put("whatsapp", f.getWhatsapp());
        db.insert("Usuario", null, cv);

        db.close();
    }
    public ArrayList<Usuario> selectAllUsers(){
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        SQLiteDatabase db = getReadableDatabase();
        String SQLSelectAllUsers = "SELECT * FROM Usuario";

        Cursor c = db.rawQuery(SQLSelectAllUsers, null);
        if(c.moveToFirst()){
            do{
                Usuario f = new Usuario(c.getString(1),c.getString(2),c.getString(3));

                usuarios.add(f);
            }while(c.moveToNext());
        }
        db.close();
        return usuarios;
    }

}
