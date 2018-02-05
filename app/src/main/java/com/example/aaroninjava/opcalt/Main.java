package com.example.aaroninjava.opcalt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickP(View v) {
        Intent it = new Intent(Main.this, inP.class);
        startActivity(it);
    }

    public void clickV(View v) {
        Intent it = new Intent(Main.this, inV.class);
        startActivity(it);
    }

}
