package com.example.android.cookit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AddRecipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recipe);
    }

    public void addViaText(View view) {
        Intent i = new Intent(this, AddRecipe.class);
        startActivity(i);
        finish();
    }
    public void addViaMlKit(View view) {
        Intent i = new Intent(this, ImageClassifierActivity.class);
        startActivity(i);
        finish();
    }
}
