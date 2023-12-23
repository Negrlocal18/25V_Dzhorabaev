package com.example.dzhorabaev_v_25;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;


public class personal_account extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_account);
    }

    public void goBack(View v) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, Notifications.class);
        startActivity(intent);

    }
}