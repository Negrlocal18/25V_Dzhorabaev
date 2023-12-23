package com.example.dzhorabaev_v_25;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, personal_account.class);
        startActivity(intent);
        btn = findViewById(R.id.button3);
    }

}
