package com.mundotrujas.appfragmentos;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
    private Button btnFragmento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragmento=(Button)findViewById(R.id.add_fragmento);
        btnFragmento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creacion  y obtener la instancia del administardor de fragmentos
                FragmentManager fragmentManager = getFragmentManager();

                //crear una nueva transaccion
                FragmentTransaction transaccion = fragmentManager.beginTransaction();

                //crear un nuevo fragmento(mi fragmento creado de java) y añadirlo a la actividad
                ContarCaracteres fragment = new ContarCaracteres();
                transaccion.add(R.id.miActividadPrincipal, fragment);

                //confirmar el cambio de la transaccion:
                transaccion.commit();
            }
        });


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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
