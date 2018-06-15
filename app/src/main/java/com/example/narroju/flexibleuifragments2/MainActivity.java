package com.example.narroju.flexibleuifragments2;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity implements Fragmenta.Communicator{

    Fragmenta f1;
    Fragementb f2;
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getFragmentManager();
        f1 =  (Fragmenta) manager.findFragmentById(R.id.fragment);
        f1.setCommunicator(this);
    }

    @Override
    public void respond(int index) {
        f2=(Fragementb) manager.findFragmentById(R.id.fragment2);
        if(f2!=null && f2.isVisible())
        {
            f2.changeData(index);
        }
        else {
            Intent intent = new Intent (this, AnotherActivity.class);
            intent.putExtra("index",index);
            startActivity(intent);
        }
    }
}
