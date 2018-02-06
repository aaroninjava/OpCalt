package com.example.aaroninjava.opcalt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class outP extends AppCompatActivity {

    TextView tvBS;
    TextView tvPr;
    TextView tvDelta;
    TextView tvVega;
    TextView tvTheta;

    DSa dsa=new DSa();
    double Pr,S,K,T,sigma,r,y;
    String CP="C";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_out_p);

        TextView tvCP = findViewById(R.id.tvoutP_CP2);
        TextView tvS = findViewById(R.id.tvoutP_S2);
        TextView tvK = findViewById(R.id.tvoutP_K2);
        TextView tvT = findViewById(R.id.tvoutP_T2);
        TextView tvV = findViewById(R.id.tvoutP_V2);
        TextView tvr = findViewById(R.id.tvoutP_r2);

        Intent it = getIntent();

        String CP = it.getStringExtra("CPs");
        String strS = it.getStringExtra("S");
        String strK = it.getStringExtra("K");
        String strT = it.getStringExtra("T");
        String strV = it.getStringExtra("V");
        String strr = it.getStringExtra("r");

        tvCP.setText(CP);
        tvS.setText(strS);
        tvK.setText(strK);
        tvT.setText(strT);
        tvV.setText(strV);
        tvr.setText(strr);

        String xPr,xDelta,xVega,xTheta;

        //CP="C";
        //CP="C";
        Pr=0.84;

        S=100;
        S=dsa.getDs(strS);

        K=110;
        K=dsa.getDs(strK);
        T=0.1;
        T=dsa.getDs(strT);
        r=0.01;
        r=dsa.getDs(strr);
        y=0;

        sigma=0.3;
        sigma=dsa.getDs(strV);

        BSa b = new BSa(CP,Pr,S,K,T,sigma,r,y);
//DSa dsa=new DSa();
        xPr=dsa.getTs(b.call());
        xDelta=dsa.getTs(b.delta(CP));
        xVega=dsa.getTs(b.vega());
        xTheta=dsa.getTs(b.theta(CP));
        //System.out.println("call"+b.call());
        //x1=dsa.getTs(b.call());
        System.out.println("Call = "+xPr);
//x1="123";
        tvBS = findViewById(R.id.tvoutP_BS);
        tvBS.setText(xPr);
        tvPr = findViewById(R.id.tvoutP_Pr2);
        tvPr.setText(xPr);
        tvDelta = findViewById(R.id.tvoutP_Delta2);
        tvDelta.setText(xDelta);
        tvVega = findViewById(R.id.tvoutP_Vega2);
        tvVega.setText(xVega);
        tvTheta = findViewById(R.id.tvoutP_theta2);
        tvTheta.setText(xTheta);


    }



    public void click1(View v)
    {
        String x1;
        //tv = findViewById(R.id.tvoutP_BS);

        //Date date=new Date();
        //System.out.println(date.toString());
        //tv.setText("123");
        //tv.setText(date.toString());
        //tv.setText(x1);
    }

}
