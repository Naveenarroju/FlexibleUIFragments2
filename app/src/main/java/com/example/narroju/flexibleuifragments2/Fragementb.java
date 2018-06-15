package com.example.narroju.flexibleuifragments2;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragementb extends Fragment {


        TextView text;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragementb, container, false);
        text= view.findViewById(R.id.text_view);
        return view;
    }
    public void changeData(int index){
        String[] descriptions = getResources().getStringArray(R.array.description);
        text.setText(descriptions[index]);
    }

}
