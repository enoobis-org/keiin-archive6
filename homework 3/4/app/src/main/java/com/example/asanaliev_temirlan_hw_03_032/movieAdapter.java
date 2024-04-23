package com.example.asanaliev_temirlan_hw_03_032;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class movieAdapter extends RecyclerView.Adapter<movieViewHolder> {

    private ArrayList<String> movieList;

    public movieAdapter(ArrayList<String> movieList) {
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public movieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new movieViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull movieViewHolder holder, int position) {
        holder.onBind(movieList.get(position));
    }


    @Override
    public int getItemCount() {
        return movieList.size();
    }
}
