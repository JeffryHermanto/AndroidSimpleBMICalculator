package com.jeffryhermanto.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioButton maleButton;
    private RadioButton femaleButton;
    private EditText ageEditText;
    private EditText feetEditText;
    private EditText inchesEditText;
    private EditText weightEditText;
    private Button calculateButton;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setupButtonClickListener();
    }

    private void findViews() {
        maleButton = findViewById(R.id.radio_button_male);
        femaleButton = findViewById(R.id.radio_button_female);
        ageEditText = findViewById(R.id.edit_text_age);
        feetEditText = findViewById(R.id.edit_text_feet);
        inchesEditText = findViewById(R.id.edit_text_inches);
        weightEditText = findViewById(R.id.edit_text_weight);
        calculateButton = findViewById(R.id.button_calculate);
        resultText = findViewById(R.id.text_view_result);
    }

    private void setupButtonClickListener() {
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateBmi();
            }
        });
    }

    private void calculateBmi() {
        int age = Integer.parseInt(ageEditText.getText().toString());
        int feet = Integer.parseInt(feetEditText.getText().toString());
        int inches = Integer.parseInt(inchesEditText.getText().toString());
        int weight = Integer.parseInt(weightEditText.getText().toString());

        int totalInches = (feet * 12) + inches;
        double heightInMeters = totalInches * 0.0254;
        double bmi = weight / (heightInMeters * heightInMeters);
        String bmiTextResults = String.valueOf(bmi);

        resultText.setText(bmiTextResults);
    }
}
