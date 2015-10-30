package com.example.estruch18.menuoption;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.security.acl.Group;


public class MainActivity extends Activity {

    //Atributos de la clase
    private RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaración de atributos de la clase
        layout = (RelativeLayout)findViewById(R.id.relativeLayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //Estructura switch para condicionar la selección del Item (mediante ID)
        switch (id){
            case R.id.mostrarMensaje:
                Toast.makeText(getApplicationContext(), "Este es el mensaje", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nuevoMensaje:
                Toast.makeText(getApplicationContext(), "Este es el nuevo mensaje", Toast.LENGTH_SHORT).show();
                break;
            case R.id.fondoRojo:
                layout.setBackgroundColor(Color.RED);
                break;
            case R.id.activity:
                Intent act2 = new Intent(getApplicationContext(), Activity2.class);
                startActivity(act2);
                break;
            case R.id.fondoAzul:
                layout.setBackgroundColor(Color.BLUE);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
