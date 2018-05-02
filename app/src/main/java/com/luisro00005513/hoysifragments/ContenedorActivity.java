package com.luisro00005513.hoysifragments;

import android.content.res.Configuration;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ContenedorActivity extends AppCompatActivity implements Menus.OnFragmentInteractionListener,
        Selects.OnFragmentInteractionListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        
    }


}
