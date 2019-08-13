package com.padcmyanmar.padc9.assignment_2.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.padcmyanmar.padc9.assignment_2.R;
import com.padcmyanmar.padc9.assignment_2.adapters.ItemAdapter;
import com.padcmyanmar.padc9.assignment_2.delegates.ItemClickListener;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL,false));

        ItemAdapter itemAdapter = new ItemAdapter(this);
        recyclerView.setAdapter(itemAdapter);
    }

    @Override
    public void onClicked() {
        startActivity(new Intent(this, ItemDetailActivity.class));
    }
}
