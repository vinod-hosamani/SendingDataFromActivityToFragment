package com.example.client1.sendingdatafromactivitytofragment;

import android.app.Fragment;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by client1 on 1/4/2018.
 */

public class ReplaceFragment extends android.support.v4.app.Fragment
{
    TextView fn,ln;

    public static ReplaceFragment newInstance(CustModel custModel) {
        
        Bundle args = new Bundle();
        args.putParcelable("data", custModel);
        ReplaceFragment fragment = new ReplaceFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
         View view=inflater.inflate(R.layout.fragment_replace,container,false);

         fn=(TextView)view.findViewById(R.id.firstName);
         ln=(TextView)view.findViewById(R.id.lastName);

         CustModel model=getArguments().getParcelable("data");
         fn.setText(model.firstName);
         ln.setText(model.lastName);

        /* Bundle bundle=this.getArguments();
         CustModel custModel=bundle.getParcelable("data");
         fn.setText(custModel.firstName);
         ln.setText(custModel.lastName);*/

         return view;
        
    }

    /*public static Fragment newInstance(CustModel custModel) {
        return null;
    }*/
}
