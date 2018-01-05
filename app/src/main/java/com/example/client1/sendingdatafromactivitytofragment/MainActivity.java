package com.example.client1.sendingdatafromactivitytofragment;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements CustomAdapter.onClick {
    RecyclerView recyclerView;
   public ArrayList<CustModel> dataLogList;
    CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView()
    {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        customAdapter = new CustomAdapter(prepareData(), this);
        recyclerView.setAdapter(customAdapter);
    }

    private ArrayList<CustModel> prepareData() {
        dataLogList = new ArrayList<>();

        CustModel modelList;


        modelList = new CustModel();
        modelList.firstName = "john";
        modelList.lastName = "cena";
        dataLogList.add(modelList);

        modelList = new CustModel();
        modelList.firstName = "rock";
        modelList.lastName = "body";
        dataLogList.add(modelList);

        modelList = new CustModel();
        modelList.firstName = "david";
        modelList.lastName = "batista";
        dataLogList.add(modelList);

        modelList = new CustModel();
        modelList.firstName = "michael";
        modelList.lastName = "jackson";
        dataLogList.add(modelList);
        return dataLogList;
    }

    @Override
    public void onClick(View v, int position) {
       /* CustModel custModel = dataLogList.get(position);
        Bundle bundle=new Bundle();
        bundle.putParcelable("data",custModel);
        ReplaceFragment replaceFragment=new ReplaceFragment();
        replaceFragment.setArguments(bundle);
*/

        Intent intent=new Intent(this,MainActivityTwo.class);
        Bundle bundle=new Bundle();
        bundle.putParcelable("data", dataLogList.get(position));

        intent.putExtras(bundle);

        startActivity(intent);


       /*
       *   FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ReplaceFragment fragment = new ReplaceFragment();
        fragmentTransaction.replace(R.id.fraameLayout, fragment);
        fragmentTransaction.commit();
       *
       * */


      /*  CustModel custModel = dataLogList.get(position);
        ReplaceFragment fragment = ReplaceFragment.newInstance(custModel);
        FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
       // ReplaceFragment fragment = new ReplaceFragment();
        fragmentTransaction.replace(R.id.fraameLayout, fragment);
        fragmentTransaction.commit();
*/




     /*
     *  CustModel custModel = dataLogList.get(position);
        Fragment fragment = FragmentTwo.newInstance(custModel);
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, fragment); // fragment container id in first parameter is the  container(Main layout id) of Activity
        transaction.addToBackStack(null);  // this will manage backstack
        transaction.commit();
     *
     *
     * */

        /*android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ReplaceFragment replaceFragment1=new ReplaceFragment();
        fragmentTransaction.replace(R.id.fraameLayout, replaceFragment1);
        fragmentTransaction.commit();*/




    }
}
