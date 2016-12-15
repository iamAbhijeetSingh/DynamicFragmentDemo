package com.abhijeet.dynamicfragmentdemo;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    HeaderFragment headerFragment;
    FragmentManager mgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mgr = getSupportFragmentManager();
        headerFragment = new HeaderFragment();
        mgr.beginTransaction().add(R.id.fragmentContainer, headerFragment).commit();

    }

    public void removeFrag(View v) {
        mgr.beginTransaction().remove(headerFragment).commit();
    }
}
