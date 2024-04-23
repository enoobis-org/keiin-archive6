package com.example.asanaliev_temirlan_hw_03_033;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {

    private RecyclerView rvCountry;
    private ArrayList<String> countryList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        loadData();
        ContryAdapter contryAdapter = new ContryAdapter(countryList);
        rvCountry.setAdapter(contryAdapter);
    }

    private void loadData() {
        countryList.add("Кыргызстан");
        countryList.add("Россия");
        countryList.add("США");
        countryList.add("Япония");
        countryList.add("Бразилия");
        countryList.add("Китай");
        countryList.add("Италия");
        countryList.add("Канада");
    }

    private void initView() {
        rvCountry = requireActivity().findViewById(R.id.rv_country);
    }
}