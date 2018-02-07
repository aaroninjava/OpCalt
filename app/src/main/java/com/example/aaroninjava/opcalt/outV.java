package com.example.aaroninjava.opcalt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class outV extends AppCompatActivity {

    TextView tvBS;
    TextView tvIV;
    TextView tvDelta;
    TextView tvVega;
    TextView tvTheta;

    DSa dsa=new DSa();
    double Pr,S,K,T,sigma,r,y;
    String CP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_out_v);

        TextView tvS = findViewById(R.id.tvoutV_S2);
        TextView tvK = findViewById(R.id.tvoutV_K2);
        TextView tvT = findViewById(R.id.tvoutV_T2);
        TextView tvPr = findViewById(R.id.tvoutV_Pr2);
        TextView tvr = findViewById(R.id.tvoutV_r2);

        Intent it = getIntent();

        String strS = it.getStringExtra("S");
        String strK = it.getStringExtra("K");
        String strT = it.getStringExtra("T");
        String strPr = it.getStringExtra("Pr");
        String strr = it.getStringExtra("r");

        tvS.setText(strS);
        tvK.setText(strK);
        tvT.setText(strT);
        tvPr.setText(strPr);
        tvr.setText(strr);

        String xIV,xDelta,xVega,xTheta;
        String x1;

        CP="C";

        Pr=0.84;
        Pr=dsa.getDs(strPr);

        S=100;
        S=dsa.getDs(strS);

        K=110;
        K=dsa.getDs(strK);

        T=0.1;
        T=(dsa.getDs(strT))/365;

        r=0.01;
        r=(dsa.getDs(strr))/100;
        y=0;

        sigma=0.3;

        BSa b = new BSa(CP,Pr,S,K,T,sigma,r,y);
//DSa dsa=new DSa();
        xIV=dsa.getTs(100*b.iv1());
        xDelta=dsa.getTs(b.delta(CP));
        xVega=dsa.getTs(b.vega());
        xTheta=dsa.getTs(b.theta(CP));

//System.out.println("call"+b.call());
        //x1=dsa.getTs(b.call());
        //System.out.println("Call = "+x1);
//x1="123";
        tvBS = findViewById(R.id.tvoutV_BS);
        tvBS.setText(xIV);

        tvIV = findViewById(R.id.tvoutV_IV2);
        tvIV.setText(xIV);
        tvDelta = findViewById(R.id.tvoutV_Delta2);
        tvDelta.setText(xDelta);
        tvVega = findViewById(R.id.tvoutV_Vega2);
        tvVega.setText(xVega);
        tvTheta = findViewById(R.id.tvoutV_theta2);
        tvTheta.setText(xTheta);
    }

    public void click1(View v)
    {
        String x1;
        tvBS = findViewById(R.id.tvoutV_BS);


        //Date date=new Date();
        //System.out.println(date.toString());
        //tv.setText("123");
        //tv.setText(date.toString());
        //tv.setText(x1);
    }


}
