package com.example.asanaliev_temirlan_hw_03_031;

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

    private RecyclerView rvContact;
    private ArrayList<String> contactList = new ArrayList<>();

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
        ContactAdapter contactAdapter = new ContactAdapter(contactList);
        rvContact.setAdapter(contactAdapter);
    }

    private void loadData() {
        contactList.add("Maма");
        contactList.add("Папа");
        contactList.add("Айдан");
        contactList.add("Работа");
        contactList.add("Айжамал");
        contactList.add("Тиля");
        contactList.add("Эдю");
        contactList.add("Маха");
        contactList.add("Ислам");
        contactList.add("Никита");
        contactList.add("Нурба");
        contactList.add("Рус");
    }

    private void initView() {
        rvContact = requireActivity().findViewById(R.id.rv_contacts);
    }
}