package com.example.classwork04.country;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.classwork04.country.CountryAdapter;
import com.example.classwork04.databinding.FragmentSecondBinding;

import java.util.ArrayList;
import java.util.Objects;


public class CountryFragment extends Fragment {
    private FragmentSecondBinding binding;
    private ArrayList<String> countryList = new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        CountryAdapter countryAdapter = new CountryAdapter(countryList);
        assert getArguments() != null;
        String continent = getArguments().getString("key1");
        assert continent != null;
        position(continent);
        binding.rvCountry.setAdapter(countryAdapter);

    }

    private void position(String continent) {
        if (Objects.equals(continent, "Eurasia")) {
            countryList.add("Russia");
            countryList.add("Kyrgyzstan");
            countryList.add("Turkey");
            countryList.add("China");
            countryList.add("Italy");
        } else if (Objects.equals(continent, "Africa")) {
            countryList.add("Egypt");
            countryList.add("Qatar");
            countryList.add("Angola");
            countryList.add("Morocco");
            countryList.add("Nigeria");
        } else if (Objects.equals(continent, "North America")) {
            countryList.add("USA");
            countryList.add("Canada");
            countryList.add("Mexico");
            countryList.add("Cuba");
            countryList.add("Haiti");
        } else if (Objects.equals(continent, "South America")) {
            countryList.add("Brazil");
            countryList.add("Argentina");
            countryList.add("Peru");
            countryList.add("Columbia");
            countryList.add("Chili");
        } else if (Objects.equals(continent, "Australia")) {
            countryList.add("Australia");
        }
    }
}

