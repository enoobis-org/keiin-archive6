package com.example.classwork04;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.classwork04.continent.ContinentFragment;
import com.example.classwork04.databinding.ActivityMainBinding; // Import the generated binding class

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction().add(R.id.container, new ContinentFragment()).commit();
    }
}
