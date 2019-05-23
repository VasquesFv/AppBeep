package com.example.filip.appbeep;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



public class SliderIntroAdapter extends FragmentPagerAdapter {

    SliderIntroAdapter(FragmentManager fm) {
        super(fm);
    }

        @Override
        public Fragment getItem ( int position){
            switch (position) {
                case 0:
                    return SliderIntroFragment.newInstance("Ganhe pontos para trocar como quiser", "Com o Beep voce pode ficar sempre a par da programacao da sua emissora favorita", R.drawable.logo, false);

                case 1:
                    return SliderIntroFragment.newInstance("Acompanhe seus principais programas", "Com apenas 2 clicks voce avalia sua emissora", R.drawable.logo,false);

                case 2:
                    return SliderIntroFragment.newInstance("Seja ouvido com o beep", "o Beep reconhece sozinho atraves de IA a emissora que esta assistindo", R.drawable.logo,false);

                case 3:
                    return SliderIntroFragment.newInstance("Analise de imagem com IA", "ocom os beepoints voce pode conseguir cupom de descontos em varios servicos", R.drawable.logo,true);
            }
            return null;

        }

    @Override
    public int getCount() {
        return 4;
    }
}



