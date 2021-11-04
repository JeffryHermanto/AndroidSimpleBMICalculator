package com.jeffryhermanto.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String alertText = "This is my alert text";

        Toast.makeText(this, alertText, Toast.LENGTH_LONG).show();
    }
}
