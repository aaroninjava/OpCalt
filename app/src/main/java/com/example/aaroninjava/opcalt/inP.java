package com.example.aaroninjava.opcalt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class inP extends AppCompatActivity {

    ToggleButton togP;
    String CP="Call";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_p);

        togP = (ToggleButton) findViewById(R.id.tBt_CP);

        togP.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // 當按鈕第一次被點擊時候響應的事件
                if (togP.isChecked()) {
                    Toast.makeText(inP.this, "Put", Toast.LENGTH_SHORT).show();
                    CP="Put";
                }
                // 當按鈕再次被點擊時候響應的事件
                else {
                    Toast.makeText(inP.this, "Call", Toast.LENGTH_SHORT).show();
                    CP="Call";
                }
            }


        });

    }


    public void clickinP(View v) {
        EditText edS = findViewById(R.id.edinP_S);
        EditText edK = findViewById(R.id.edinP_K);
        EditText edT = findViewById(R.id.edinP_T);
        EditText edV = findViewById(R.id.edinP_V);
        EditText edr = findViewById(R.id.edinP_r);

        Intent it = new Intent(inP.this, outP.class);

        it.putExtra("CPs", CP);
        it.putExtra("S", edS.getText().toString());
        it.putExtra("K", edK.getText().toString());
        it.putExtra("T", edT.getText().toString());
        it.putExtra("V", edV.getText().toString());
        it.putExtra("r", edr.getText().toString());

        startActivity(it);

    }



}
