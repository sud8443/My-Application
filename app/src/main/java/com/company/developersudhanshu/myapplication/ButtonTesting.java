package com.company.developersudhanshu.myapplication;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ButtonTesting extends AppCompatActivity {

    Button gameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_testing);

        gameButton = (Button) findViewById(R.id.gameButton);

        gameButton.setBackground(ContextCompat.getDrawable(this,R.drawable.button_normal));

        gameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameButton.setBackground(ContextCompat.getDrawable(ButtonTesting.this,R.drawable.button_clicked));
            }
        });

        gameButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                gameButton.setBackground(ContextCompat.getDrawable(ButtonTesting.this,R.drawable.button_long_clicked));
                return true;
            }
        });

    }
}
