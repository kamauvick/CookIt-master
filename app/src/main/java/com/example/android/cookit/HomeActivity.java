package com.example.android.cookit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    String message;
    Button recipeadd;
    private CardView cardone, cardtwo, cardthree, cardfour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cardone = findViewById(R.id.cardone);
        cardtwo = findViewById(R.id.cardtwo);
        cardthree = findViewById(R.id.cardthree);
        cardfour = findViewById(R.id.cardfour);

        cardone.setOnClickListener(this);
        cardtwo.setOnClickListener(this);
        cardthree.setOnClickListener(this);
        cardfour.setOnClickListener(this);

        recipeadd = findViewById(R.id.buttonaddrecipe);
    }

    public void addNewRecipe(View view) {
        Intent i = new Intent(this, AddRecipe.class);
        startActivity(i);
        finish();
    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()) {
            case R.id.cardone:
                i = new Intent(this, RecipeActivity.class);
                startActivity(i);
                break;
            case R.id.cardtwo:
                i = new Intent(this, FriesActivity.class);
                startActivity(i);
                break;
            case R.id.cardthree:
                i = new Intent(this, RiceActivity.class);
                startActivity(i);
                break;
            case R.id.cardfour:
                i = new Intent(this, OmletteActivity.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }


}



