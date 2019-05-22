package com.example.filip.appbeep;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected  void onCreate (Bundle savedInstancesState){
        super.onCreate(savedInstancesState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new SliderIntroAdapter(getSupportFragmentManager()));


    }

}
