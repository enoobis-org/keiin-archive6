package com.example.calculator_hw_07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button button = findViewById(R.id.heart_button);
        button.setOnClickListener(v -> {

        });
        Spinner spinner = findViewById(R.id.dropdown_menu);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.choice_color, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        Button buttonHeart = findViewById(R.id.heart_button);
        buttonHeart.setOnClickListener(v -> {
            if (buttonHeart.getBackground().getConstantState().equals(getResources().getDrawable(R.drawable.ic_heart).getConstantState())) {
                buttonHeart.setBackgroundResource(R.drawable.ic_heart_2);
            } else {
                buttonHeart.setBackgroundResource(R.drawable.ic_heart);
            }
        });
        findViewById(R.id.bottom_next).setOnClickListener(v -> {
            Intent intent = new Intent(this, Activity2.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            finish();

        });
        String data = getIntent().getStringExtra("key");
        TextView textView = findViewById(R.id.text_ex);
        textView.setText(data);
    }
}