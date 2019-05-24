package com.example.filip.appbeep;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    public Button buttonstart;

    @Override
    protected  void onCreate (Bundle savedInstancesState){
        super.onCreate(savedInstancesState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new SliderIntroAdapter(getSupportFragmentManager()));

        buttonstart= (Button) findViewById(R.id.btnCadaster);

    }



}
