package com.padcmyanmar.padc9.assignment_2.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.padcmyanmar.padc9.assignment_2.R;
import com.padcmyanmar.padc9.assignment_2.delegates.ItemClickListener;
import com.padcmyanmar.padc9.assignment_2.holders.ItemHolder;

public class ItemAdapter extends RecyclerView.Adapter {

    private ItemClickListener itemClickListener;

    public ItemAdapter(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_list_items, viewGroup, false);
        return new ItemHolder(itemView, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
