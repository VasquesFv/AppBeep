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
                    return SliderIntroFragment.newInstance("Pontue com seu programa favorito",
                            "Diz pra gente o que você está assistindo ou ouvindo e ganhe pontos.",
                            R.drawable.onboarding01, false);

                case 1:
                    return SliderIntroFragment.newInstance("Alertas para você não perder nada",
                            "Fale seus gostos que a gente te avisa quando seu programa começar.",
                            R.drawable.onboarding02,false);

                case 2:
                    return SliderIntroFragment.newInstance("Produtos especiais para Beepers",
                            "Troque seus pontos por produtos em nossas lojas parceiras.",
                            R.drawable.onboarding03,true);

            }
            return null;

        }

    @Override
    public int getCount() {
        return 3;
    }
}



