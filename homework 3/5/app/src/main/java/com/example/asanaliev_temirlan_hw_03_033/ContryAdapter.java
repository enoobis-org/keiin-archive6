package com.example.asanaliev_temirlan_hw_03_033;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContryAdapter extends RecyclerView.Adapter<CountryViewHolder> {
    private ArrayList<String> countryList;

    public ContryAdapter(ArrayList<String> countryList) {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.country_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.onBind(countryList.get(position));
    }



    @Override
    public int getItemCount() {
        return countryList.size();
    }
}
