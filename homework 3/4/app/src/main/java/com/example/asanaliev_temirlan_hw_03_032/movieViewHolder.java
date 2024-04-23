package com.example.asanaliev_temirlan_hw_03_032;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class movieViewHolder extends RecyclerView.ViewHolder {
    private TextView tvMovie;
    public movieViewHolder(@NonNull View itemView) {
        super(itemView);
        tvMovie = itemView.findViewById(R.id.rv_movie);
    }
    public void onBind(String movie){
        tvMovie.setText(movie);
    }
}
