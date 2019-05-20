package com.example.filip.appbeep;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.rd.PageIndicatorView;
import android.support.v4.view.ViewPager;


public class SliderIntroAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;



    //list of images
    public int[] list_images = {
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo
    };

        //lis of titles
    public String[] list_titles = {
            "Seja ouvido com o Beep",
            "Ganhe pontos para trocar como quiser",
            "Acompanhe seus principais programas",
            "Analise de imagem com IA"
    };

    //list of descriptions
    public String[] list_descriptions = {
            "Com apenas 2 clicks voce avalia sua emissora",
            "com os beepoints voce pode conseguir cupom de descontos em varios servicos",
            "Com o Beep voce pode ficar sempre a par da programacao da sua emissora favorita",
            "o Beep reconhece sozinho atraves de IA a emissora que esta assistindo"
    };


    public SliderIntroAdapter (Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return list_images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout)object);
    }


    public Object instantiateItem(ViewGroup container, int position) {



        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slider_intro,container,false);
        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.slidelinearlayout);

        ImageView imgslide = (ImageView) view.findViewById(R.id.slideimage);
        imgslide.setImageResource(list_images[position]);

        TextView textitle = (TextView) view.findViewById(R.id.textitle);
        textitle.setText(list_titles[position]);

        TextView textdescription = (TextView) view.findViewById(R.id.textdescription);
        textdescription.setText(list_descriptions[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);

    }

}
