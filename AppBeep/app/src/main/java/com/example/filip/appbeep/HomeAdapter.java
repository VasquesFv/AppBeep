package com.example.filip.appbeep;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.myViewHolder> {

    Context mContext;
    List<ItemCardView> mData;

    public HomeAdapter(Context mContext, List<ItemCardView> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public HomeAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(R.layout.card_item,viewGroup,false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.myViewHolder myViewHolder, int position) {

        myViewHolder.background_img.setImageResource(mData.get(position).getBackground());
        myViewHolder.text_tite.setText(mData.get(position).getCardtitle());
        myViewHolder.text_gen.setText(mData.get(position).getCardgenero());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class myViewHolder extends RecyclerView.ViewHolder{

        ImageView background_img;
        TextView text_gen, text_tite;


        public myViewHolder( View itemView) {
            super(itemView);

            background_img =itemView.findViewById(R.id.card_background);
            text_gen=itemView.findViewById(R.id.card_gen);
            text_tite=itemView.findViewById(R.id.card_title);

        }
    }
}
