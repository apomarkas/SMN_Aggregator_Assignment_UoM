package com.example.smn_aggregator_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity  {
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent explicitIntent = new Intent(MainActivity.this,TrendsActivity.class);
        button = findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {



                startActivity(explicitIntent);








            }
        });




        }












    }






