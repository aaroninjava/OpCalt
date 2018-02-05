package com.example.aaroninjava.opcalt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class inP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_p);


    }


    public void clickinP(View v) {
        EditText edS = findViewById(R.id.edinP_S);
        EditText edK = findViewById(R.id.edinP_K);
        EditText edT = findViewById(R.id.edinP_T);
        EditText edV = findViewById(R.id.edinP_V);
        EditText edr = findViewById(R.id.edinP_r);
        Intent it = new Intent(inP.this, outP.class);
        it.putExtra("S", edS.getText().toString());
        it.putExtra("K", edK.getText().toString());
        it.putExtra("T", edT.getText().toString());
        it.putExtra("V", edV.getText().toString());
        it.putExtra("r", edr.getText().toString());
        startActivity(it);

    }



}
