package com.example.filip.appbeep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;



public class HomeActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        mToolbar = findViewById(R.id.m_toolbar);
        setSupportActionBar(mToolbar);


        /*ImageView btnRecognize = findViewById(R.id.buttonRecognize);

        btnRecognize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/

        RecyclerView recyclerView = findViewById(R.id.card_recycler_view);
        List<ItemCardView> mList = new ArrayList<>();

        mList.add(new ItemCardView(R.drawable.a,"Globo Esporte", "Noticias, Esportes"));
        mList.add(new ItemCardView(R.drawable.b,"Acelerados","Noticias, Automovel"));
        mList.add(new ItemCardView(R.drawable.c,"Globo Esporte","Noticias, Esportes"));
        mList.add(new ItemCardView(R.drawable.d,"Acelerados","Noticias, Automovel"));
        mList.add(new ItemCardView(R.drawable.e,"Globo Esporte","Noticias, Esportes"));
        mList.add(new ItemCardView(R.drawable.f,"Acelerados","Noticias, Automovel"));
        mList.add(new ItemCardView(R.drawable.g,"Globo Esporte","Noticias, Esportes"));

        HomeAdapter adapter = new HomeAdapter(this,mList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        }

    }

