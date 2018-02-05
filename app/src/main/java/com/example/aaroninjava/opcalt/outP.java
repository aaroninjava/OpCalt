package com.example.aaroninjava.opcalt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class outP extends AppCompatActivity {

    TextView tv;
    DSa dsa=new DSa();
    double Pr,S,K,T,sigma,r,y;
    String CP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_out_p);

        TextView tvS = findViewById(R.id.tvoutP_S2);
        TextView tvK = findViewById(R.id.tvoutP_K2);
        TextView tvT = findViewById(R.id.tvoutP_T2);
        TextView tvV = findViewById(R.id.tvoutP_V2);
        TextView tvr = findViewById(R.id.tvoutP_r2);
        Intent it = getIntent();
        String strS = it.getStringExtra("S");
        String strK = it.getStringExtra("K");
        String strT = it.getStringExtra("T");
        String strV = it.getStringExtra("V");
        String strr = it.getStringExtra("r");
        tvS.setText(strS);
        tvK.setText(strK);
        tvT.setText(strT);
        tvV.setText(strV);
        tvr.setText(strr);

        String x1;

        CP="C";
        Pr=1.732;
        Pr=0.84;
        S=100;
        K=110;
        T=0.1;
        r=0.01;
        y=0;
        sigma=0.3;

        BSa b = new BSa(CP,Pr,S,K,T,sigma,r,y);
//DSa dsa=new DSa();
        x1=dsa.getTs(b.iv1());
//System.out.println("call"+b.call());
        //x1=dsa.getTs(b.call());
        System.out.println("Call = "+x1);
//x1="123";
        tv = findViewById(R.id.tvoutP_BS);
        tv.setText(x1);

    }



    public void click1(View v)
    {
        String x1;
        tv = findViewById(R.id.tvoutP_BS);

        //Date date=new Date();
        //System.out.println(date.toString());
        //tv.setText("123");
        //tv.setText(date.toString());
        //tv.setText(x1);
    }

}
