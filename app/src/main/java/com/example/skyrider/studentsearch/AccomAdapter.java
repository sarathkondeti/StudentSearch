package com.example.skyrider.studentsearch;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by skyrider on 5/6/17.
 */

public class AccomAdapter extends RecyclerView.Adapter<AccomAdapter.AccomViewHolder> {
    public static ArrayList<AccomDetails> adapterData;
    Context context;


    public static int postionValue;


    AccomAdapter(Context context, ArrayList<AccomDetails> Data){
        adapterData = Data;
        this.context=context;
    }
    @Override
    public AccomAdapter.AccomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater;
        inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.accomplishments_card,parent,false);
        AccomViewHolder viewHolder=new AccomViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AccomAdapter.AccomViewHolder holder, final int position) {
        holder.organisation.setText(adapterData.get(position).accomOrgan);
        holder.position.setText(adapterData.get(position).accomPos);
        holder.fromyear.setText(adapterData.get(position).accomFromyear);
        holder.toyear.setText(adapterData.get(position).accomToyear);


    }

    @Override
    public int getItemCount() {
        return adapterData.size();
    }

    public class AccomViewHolder extends RecyclerView.ViewHolder{
        public CardView cardview;
        public TextView organisation,position,fromyear,toyear;

        public AccomViewHolder(View itemView) {
            super(itemView);
            cardview     = (CardView) itemView.findViewById(R.id.accom_cardview);
            organisation = (TextView) itemView.findViewById(R.id.accom_card_organ);
            position     = (TextView) itemView.findViewById(R.id.accom_card_pos);
            fromyear     = (TextView) itemView.findViewById(R.id.accom_card_fromyear);
            toyear       = (TextView) itemView.findViewById(R.id.accom_card_toyear);

        }

    }





}
