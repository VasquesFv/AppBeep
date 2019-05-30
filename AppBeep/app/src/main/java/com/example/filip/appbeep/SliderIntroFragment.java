package com.example.filip.appbeep;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class SliderIntroFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        return inflater.inflate(R.layout.fragment_slider_intro, container,false);

    }


    public static SliderIntroFragment newInstance(final String textitle, String textdescription, int slideimage, boolean Boolean) {
        final SliderIntroFragment myFragment = new SliderIntroFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("boolean", Boolean);
        bundle.putInt("image",slideimage);
        bundle.putString("title", textitle);
        bundle.putString("description",textdescription);
        myFragment.setArguments(bundle);
        return myFragment;

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView title = view.findViewById(R.id.textitle);
        TextView description = view.findViewById(R.id.textdescription);
        ImageView image = view.findViewById(R.id.slideimage);
        Button buttonCadaster = view.findViewById(R.id.btnCadaster);

        Bundle bundle = getArguments();
        int slideimage = bundle.getInt("image", R.drawable.logo);
        String textitle = bundle.getString("title");
        String textdescription = bundle.getString("description");
        boolean bosta = bundle.getBoolean("boolean");

        title.setText(textitle);
        description.setText(textdescription);
        image.setImageDrawable(getResources().getDrawable(slideimage));

        if(bosta) {buttonCadaster.setVisibility(View.VISIBLE);

        buttonCadaster.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), RegisterActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });
        }
    }
}


