package com.example.dzhorabaev_v_25;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Notifications extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
    }

    public void goBack(View v) {
        Intent intent = new Intent(this, personal_account.class);
        startActivity(intent);
    }
}
