package com.padcmyanmar.padc9.assignment_2.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.padcmyanmar.padc9.assignment_2.delegates.ItemClickListener;

public class ItemHolder extends RecyclerView.ViewHolder {

    private ItemClickListener itemClickListener;

    public ItemHolder(@NonNull View itemView, ItemClickListener clickListener) {

        super(itemView);
        itemClickListener = clickListener;

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onClicked();
            }
        });
    }
}
