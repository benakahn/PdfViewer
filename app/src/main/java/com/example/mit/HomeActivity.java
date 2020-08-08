package com.example.mit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void next(View view){
        if (view.getId()==R.id.b){
            Intent i=new Intent(this,SubActivity.class);
            startActivity(i);
        }
    }
}