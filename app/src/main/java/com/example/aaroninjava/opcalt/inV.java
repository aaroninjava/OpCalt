package com.example.aaroninjava.opcalt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class inV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_v);

    }

    public void clickinV(View v) {

        EditText edS = findViewById(R.id.edinV_S);
        EditText edK = findViewById(R.id.edinV_K);
        EditText edT = findViewById(R.id.edinV_T);
        EditText edPr = findViewById(R.id.edinV_Pr);
        EditText edr = findViewById(R.id.edinV_r);

        Intent it = new Intent(inV.this, outV.class);

        it.putExtra("S", edS.getText().toString());
        it.putExtra("K", edK.getText().toString());
        it.putExtra("T", edT.getText().toString());
        it.putExtra("Pr", edPr.getText().toString());
        it.putExtra("r", edr.getText().toString());

        startActivity(it);

    }



}
