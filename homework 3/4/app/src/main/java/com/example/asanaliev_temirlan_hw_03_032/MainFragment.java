package com.example.asanaliev_temirlan_hw_03_032;

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

    private ArrayList<String> movieList = new ArrayList<>();
    private RecyclerView rvMovie;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        loadData();
        movieAdapter movieAdapter = new movieAdapter(movieList);
        rvMovie.setAdapter(movieAdapter);
    }

    private void loadData() {
        movieList.add("Зеленая миля");
        movieList.add("1+1");
        movieList.add("Криминальное чтиво");
        movieList.add("Побег из Шоушенко");
        movieList.add("Человек-Паук");
        movieList.add("Паразиты");
        movieList.add("Тор");
        movieList.add("Гарри Потер");
        movieList.add("Форсаж");
    }

    private void initView() {
        rvMovie = requireActivity().findViewById(R.id.rv_movie);
    }
}