package com.example.smn_aggregator_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity  {
    private Button buttonTrends;
    private Button buttonSearch;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent trendsIntent = new Intent(MainActivity.this,TrendsActivity.class);
        final Intent searchIntent = new Intent(MainActivity.this,SearchActivity.class);
        buttonTrends = findViewById(R.id.trendsButton);

        buttonTrends.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {



                startActivity(trendsIntent);








            }
        });

        buttonSearch = findViewById(R.id.searchButton);
        buttonSearch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {



                startActivity(searchIntent);








            }
        });





        }












    }






