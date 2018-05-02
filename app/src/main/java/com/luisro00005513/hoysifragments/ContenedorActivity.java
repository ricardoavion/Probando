package com.luisro00005513.hoysifragments;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class ContenedorActivity extends AppCompatActivity implements Menus.OnFragmentInteractionListener,
        Selects.OnFragmentInteractionListener,Nexus,View.OnClickListener{





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor);
        //-------------------------------------
        LinearLayout summary = (LinearLayout) findViewById(R.id.summary_linear);
        summary.setOnClickListener(this);
        LinearLayout accounts = (LinearLayout) findViewById(R.id.accounts_linear);
        accounts.setOnClickListener(this);
        LinearLayout incomes = (LinearLayout) findViewById(R.id.incomes_linear);
        incomes.setOnClickListener(this);
        LinearLayout expenses = (LinearLayout) findViewById(R.id.expenses_linear);
        expenses.setOnClickListener(this);
        LinearLayout stock = (LinearLayout) findViewById(R.id.stock_linear);
        stock.setOnClickListener(this);
        //------------------------------



    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        
    }


    @Override
    public void OnClickLinear(String mensaje) {
        Intent intent = new Intent(this, ContenedorActivity2.class);



    }

    //==================switch con todos los botones====================
    @Override
    public void onClick(View v) {
        FragmentTransaction fr = getSupportFragmentManager().beginTransaction();

        switch(v.getId()){
            //--------Summary-----------
            case R.id.summary_linear:
                if(findViewById(R.id.layout_default) != null){
                    Intent intent = new Intent(this, ContenedorActivity2.class);
                    intent.putExtra("summary",1);
                    startActivity(intent);
                    break;
                }//verificando si estoy en landscape
                else{
                    fr.replace(R.id.landscape2, new FragmentSummary());
                    //fr.addToBackStack(null);
                    fr.commit();
                    break;
                }
            //--------Accounts---------
            case R.id.accounts_linear:
                if(findViewById(R.id.layout_default) != null){
                    Intent intent = new Intent(this, ContenedorActivity2.class);
                    intent.putExtra("account",2);
                    startActivity(intent);
                    break;
                }//verificando si estoy en landscape
                else{
                    fr.replace(R.id.landscape2, new FragmentAccounts());
                    //fr.addToBackStack(null);
                    fr.commit();
                    break;
                }
            //------Incomes-----------
            case R.id.incomes_linear:
                if(findViewById(R.id.layout_default) != null){
                    Intent intent = new Intent(this, ContenedorActivity2.class);
                    intent.putExtra("incomes",3);
                    startActivity(intent);
                    break;
                }//verificando si estoy en landscape
                else{
                    fr.replace(R.id.landscape2, new FragmentIncomes());
                    //fr.addToBackStack(null);
                    fr.commit();
                    break;
                }
            //-----Expenses----------
            case R.id.expenses_linear:
                if(findViewById(R.id.layout_default) != null){
                    Intent intent = new Intent(this, ContenedorActivity2.class);
                    intent.putExtra("expenses", 4);
                    startActivity(intent);
                    break;
                }//verificando si estoy en landscape
                else{
                    fr.replace(R.id.landscape2, new FragmentExpenses());
                    //fr.addToBackStack(null);
                    fr.commit();
                    break;
                }
            //----------Stocks-----------
            case R.id.stock_linear:
                if(findViewById(R.id.layout_default) != null){
                    Intent intent = new Intent(this, ContenedorActivity2.class);
                    intent.putExtra("stock",5);
                    startActivity(intent);
                    break;
                }//verificando si estoy en landscape
                else{
                    fr.replace(R.id.landscape2, new FragmentStock());
                    //fr.addToBackStack(null);
                    fr.commit();
                    break;
                }
        }//switch

    }//onClick
}//clase
