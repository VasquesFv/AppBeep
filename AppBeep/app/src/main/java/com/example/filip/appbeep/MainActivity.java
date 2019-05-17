package com.example.filip.appbeep;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.LinearLayout;
import com.rd.PageIndicatorView;


public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SliderIntroAdapter myadapter;


    @Override
    protected  void onCreate (Bundle savedInstancesState){
        super.onCreate(savedInstancesState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);
        myadapter = new SliderIntroAdapter(this);
        viewPager.setAdapter(myadapter);

    }

}
