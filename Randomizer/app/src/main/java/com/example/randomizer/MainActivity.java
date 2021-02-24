package com.example.randomizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rollButton;
    TextView resultTextView;
    SeekBar seekBar;
    Random random;
    int output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        random = new Random();
        rollButton = findViewById(R.id.rollButton);
        resultTextView=findViewById(R.id.resultTextView);
        seekBar = findViewById(R.id.seekBar);;
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                output = random.nextInt(seekBar.getProgress()+1);
                resultTextView.setText(""+output);
            }
        });
    }
}
