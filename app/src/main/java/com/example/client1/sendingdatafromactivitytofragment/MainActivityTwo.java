package com.example.client1.sendingdatafromactivitytofragment;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by client1 on 1/4/2018.
 */

public class MainActivityTwo extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        /*ReplaceFragment replaceFragment=new ReplaceFragment();
        FragmentManager manager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fraameLayout, replaceFragment);
        transaction.commit();*/

        CustModel custModel=getIntent().getExtras().getParcelable("data");


      //  CustModel custModel = dataLogList.get(position);
      //  CustModel custModel = dataLogList.get(position);
        ReplaceFragment fragment = ReplaceFragment.newInstance(custModel);
        FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // ReplaceFragment fragment = new ReplaceFragment();
        fragmentTransaction.add(R.id.fraameLayout, fragment);
        fragmentTransaction.commit();
    }
}
