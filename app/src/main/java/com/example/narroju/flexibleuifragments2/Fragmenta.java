package com.example.narroju.flexibleuifragments2;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmenta extends Fragment implements AdapterView.OnItemClickListener {

    ListView listView;
    Communicator communicator;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragmenta, container, false);

        listView = view.findViewById(R.id.list_View);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),R.array.Avatars, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

        return view;
    }

   // TODO figure out why is these method used
    public void setCommunicator(Communicator communicator){
        this.communicator = communicator;
    }


    public interface Communicator
    {
        public void respond(int index);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        communicator.respond(position);
    }



}
