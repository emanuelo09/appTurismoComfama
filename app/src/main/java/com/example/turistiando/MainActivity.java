package com.example.turistiando;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    //ATRIBUTOS

    //METODOS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar bar = getSupportActionBar();

        //cambiando el color del action bar
        ColorDrawable colorBar = new ColorDrawable(Color.parseColor("#497CB2"));
        bar.setBackgroundDrawable(colorBar);

    }

    //Metodo para cambiar el idioma de mi app
    public void changeLanguage(String idiom){

        //Configurando el lenguaje del telefono
        Locale language = new Locale(idiom);
        Locale.setDefault(language);

        //Configuracion global en el talefono
        Configuration configurationPhone = getResources().getConfiguration();
        configurationPhone.locale = language;

        //Ejecutamos la cofiguracion
        getBaseContext().getResources().updateConfiguration(configurationPhone, getBaseContext().getResources().getDisplayMetrics());

    }

    //CARGAR EL MENU XML CREADO PREVIAMENTE (menu)
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return true;

    }

    //DAR FUNCIONAMIENTO AL MENU
    public boolean onOptionsItemSelected(MenuItem item) {

        //OBSERVAMOS A QUE ITEM DEL MENU LE DAMOS CLICK
        int itemSelected = item.getItemId();

        switch (itemSelected){

            case(R.id.opcion1):
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
                break;

            case(R.id.opcion2):
                this.changeLanguage("en");
                Intent intent1 = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent1);
                break;

            case(R.id.opcion3):
                this.changeLanguage("es");
                Intent intent2 = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent2);
                break;

        }

        return super.onOptionsItemSelected(item);
    }


    //LASTKEY
}