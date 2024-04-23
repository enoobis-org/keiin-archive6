package com.example.classwork04.continent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.classwork04.country.CountryFragment;
import com.example.classwork04.OnItemClick;
import com.example.classwork04.R;
import com.example.classwork04.databinding.FragmentFirstBinding;

import java.util.ArrayList;


public class ContinentFragment extends Fragment implements OnItemClick {

    private FragmentFirstBinding binding;
    private ArrayList<String> countryList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();

        ContinentAdapter adapter = new ContinentAdapter(countryList, this);
        binding.rvContinent.setAdapter(adapter);
    }

    private void loadData() {
        countryList.add("Eurasia");
        countryList.add("Africa");
        countryList.add("North America");
        countryList.add("South America");
        countryList.add("Australia");
    }

    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        String continent = countryList.get(position);
        bundle.putString("key1", continent);
        CountryFragment secondFragment = new CountryFragment();
        secondFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, secondFragment).addToBackStack(null).commit();
    }
}