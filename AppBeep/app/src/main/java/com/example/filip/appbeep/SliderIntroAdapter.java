package com.example.filip.appbeep;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.rd.PageIndicatorView;
import android.support.v4.view.ViewPager;
import android.view.View;



public class SliderIntroAdapter extends FragmentPagerAdapter {

    public SliderIntroAdapter(FragmentManager fm) {
        super(fm);
    }

        @Override
        public Fragment getItem ( int position){
            switch (position) {
                case 0:
                    return SliderIntroFragment.newInstance("Ganhe pontos para trocar como quiser", "Com o Beep voce pode ficar sempre a par da programacao da sua emissora favorita", R.drawable.logo);

                case 1:
                    return SliderIntroFragment.newInstance("Acompanhe seus principais programas", "Com apenas 2 clicks voce avalia sua emissora", R.drawable.logo);

                case 2:
                    return SliderIntroFragment.newInstance("Seja ouvido com o beep", "o Beep reconhece sozinho atraves de IA a emissora que esta assistindo", R.drawable.logo);

                case 3:
                    return SliderIntroFragment.newInstance("Analise de imagem com IA", "ocom os beepoints voce pode conseguir cupom de descontos em varios servicos", R.drawable.logo);
            }
            return null;

        }

    @Override
    public int getCount() {
        return 4;
    }
}

