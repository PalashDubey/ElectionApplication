package com.myapp.electionapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.DetailsViewHolder>  {
    private Context mCtx;
    private List<myDetails> myDetailsList;
    public DetailsAdapter(Context mCtx, List<myDetails> list) {
        this.mCtx = mCtx;
        this.myDetailsList = list;
    }
    @Override
    public DetailsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.booth_list, null);
        return new DetailsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailsViewHolder holder, int position) {
        myDetails product = myDetailsList.get(position);
        holder.name.setText(product.getName());
        holder.capacity.setText(product.getCapacity());
        holder.facility.setText(product.getFacilities());
    }

    @Override
    public int getItemCount() {
        return myDetailsList.size();
    }


    public class DetailsViewHolder extends RecyclerView.ViewHolder {
        TextView imageText,name,capacity,facility;

        public DetailsViewHolder(View itemView) {
            super(itemView);
            name =itemView.findViewById(R.id.name);
            capacity = itemView.findViewById(R.id.capacity);
            facility = itemView.findViewById(R.id.facility);
        }
    }
}
