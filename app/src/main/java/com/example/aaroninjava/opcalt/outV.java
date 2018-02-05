package com.example.aaroninjava.opcalt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class outV extends AppCompatActivity {

    TextView tv;
    DSa dsa=new DSa();
    double Pr,S,K,T,sigma,r,y;
    String CP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_out_v);


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
        tv = findViewById(R.id.tvoutV_BS);
        tv.setText(x1);

    }

    public void click1(View v)
    {
        String x1;
        tv = findViewById(R.id.tvoutV_BS);


        //Date date=new Date();
        //System.out.println(date.toString());
        //tv.setText("123");
        //tv.setText(date.toString());
        //tv.setText(x1);
    }


}
