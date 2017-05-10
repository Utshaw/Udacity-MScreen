package com.wordpress.farhantanvirutshaw.abc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by utshaw on 4/19/17.
 */

public class FragmentB extends Fragment {

    TextView textView;
    String data=null;



    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("data",data);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b,container,false);

        if(savedInstanceState != null)
        {
            TextView textView = (TextView) view.findViewById(R.id.textView);
            textView.setText(savedInstanceState.getString("data"));

        }
        return view ;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView = (TextView) getActivity().findViewById(R.id.textView);
    }

    public void changeText(String data)
    {
        this.data = data;
        textView.setText(data);
    }
}
