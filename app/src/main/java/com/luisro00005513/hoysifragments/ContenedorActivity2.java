package com.luisro00005513.hoysifragments;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ContenedorActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_2);
        //----------------------------------------
        Bundle boton = getIntent().getExtras();
        FragmentTransaction fr = getSupportFragmentManager().beginTransaction();

        if(boton.getInt("summary") == 1){
            fr.replace(R.id.contenedor2, new FragmentSummary());
            //fr.addToBackStack(null);
            fr.commit();
        }//if summary
        else if(boton.getInt("account") == 2){
            fr.replace(R.id.contenedor2, new FragmentAccounts());
            //fr.addToBackStack(null);
            fr.commit();
        }//if accounts
        else if(boton.getInt("incomes") == 3){
            fr.replace(R.id.contenedor2, new FragmentIncomes());
            //fr.addToBackStack(null);
            fr.commit();
        }//if incomes
        else if(boton.getInt("expenses") == 4){
            fr.replace(R.id.contenedor2, new FragmentExpenses());
            //fr.addToBackStack(null);
            fr.commit();
        }//if expenses
        else if(boton.getInt("stock") == 5){
            fr.replace(R.id.contenedor2, new FragmentStock());
            //fr.addToBackStack(null);
            fr.commit();
        }//if summary
    }//on create
}
