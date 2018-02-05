package com.example.aaroninjava.opcalt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class inV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_v);

    }

    public void clickinV(View v) {
        Intent it = new Intent(inV.this, outV.class);
        startActivity(it);
    }

}
