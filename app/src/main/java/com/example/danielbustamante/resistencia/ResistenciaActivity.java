package com.example.danielbustamante.resistencia;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.renderscript.Sampler;
import android.support.annotation.ColorLong;
import android.support.annotation.ColorRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.DynamicDrawableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class ResistenciaActivity extends AppCompatActivity {
    RadioGroup radioGroup, radioGroup4, radioGroup5,radioGroup3;
    RadioButton radioButton0, radioButton1, radioButton2, radioButton3;
    String texto = "", rb0="", rb1="",rb2="",rb3="";


    private TextView  t1, t2, t3, t4 , tout;
    private Button bCalcular, boton1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resistencia);
        radioGroup = findViewById(R.id.radioGroup);
        radioGroup3 = findViewById(R.id.radioGroup3);
        radioGroup4= findViewById(R.id.radioGroup4);
        radioGroup5= findViewById(R.id.radioGroup5);
        tout = findViewById(R.id.tout);

        bCalcular = findViewById(R.id.bCalcular);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"ResourceAsColor", "ResourceType"})
            @Override
            public void onClick(View view) {
                double a, b,c,d,e,f,g,h,i,j;
                int radioId = radioGroup.getCheckedRadioButtonId();
                int radio1Id = radioGroup4.getCheckedRadioButtonId();
                int radio2Id = radioGroup3.getCheckedRadioButtonId();
                int radio3Id = radioGroup5.getCheckedRadioButtonId();

                radioButton0 = findViewById(radioId);
                radioButton1 = findViewById(radio1Id);
                radioButton2 = findViewById(radio2Id);
                radioButton3 = findViewById(radio3Id);

            //tout.setText("selecciono: " + texto + radioButton0.getText()+ radioButton1.getText() +radioButton2.getText() +radioButton3.getText());



                  a = Double.parseDouble(radioButton0.getText().toString() + radioButton1.getText().toString());
                  b=  Double.parseDouble(radioButton2.getText().toString());
                  c =(a*b)/10000;


                    d= Double.parseDouble(radioButton0.getText().toString());
                    e = Double.parseDouble(radioButton1.getText().toString());
                    f = Double.parseDouble(radioButton2.getText().toString());

                    g = Double.parseDouble(radioButton3.getText().toString());
                    h = c * (g /100);
                    i= c -h;
                    j= c+ h ;

                if (g == 2){
                    t4.setBackgroundColor(getResources().getColor(R.color.red));
                }else if (g == 5){
                    t4.setBackgroundColor(getResources().getColor(R.color.gold));
                }else if (g == 10){
                    t4.setBackgroundColor(getResources().getColor(R.color.gray));
                }



                if (d == 0) {
                    t1.setBackgroundColor(getResources().getColor(R.color.black));}
                else if (d ==1){
                    t1.setBackgroundColor(getResources().getColor(R.color.maroon));
                }else if (d == 2){
                    t1.setBackgroundColor(getResources().getColor(R.color.red));
                }else if (d==3){
                    t1.setBackgroundColor(getResources().getColor(R.color.orange));
                }else if (d == 4){
                    t1.setBackgroundColor(getResources().getColor(R.color.yellow));
                }else if (d ==5){
                    t1.setBackgroundColor(getResources().getColor(R.color.green));
                }else if (d == 6){
                    t1.setBackgroundColor(getResources().getColor(R.color.blue));
                }else if (d==7){
                    t1.setBackgroundColor(getResources().getColor(R.color.blueviolet));
                }else if (d == 8){
                    t1.setBackgroundColor(getResources().getColor(R.color.gray));
                }else if (d == 9) {
                    t1.setBackgroundColor(getResources().getColor(R.color.white));
                }
        if (e == 0) {
                    t2.setBackgroundColor(getResources().getColor(R.color.black));}
                else if (e ==1){
                    t2.setBackgroundColor(getResources().getColor(R.color.maroon));
                }else if (e == 2){
                    t2.setBackgroundColor(getResources().getColor(R.color.red));
                }else if (e==3){
                    t2.setBackgroundColor(getResources().getColor(R.color.orange));
                }else if (e == 4){
                    t2.setBackgroundColor(getResources().getColor(R.color.yellow));
                }else if (e ==5){
                    t2.setBackgroundColor(getResources().getColor(R.color.green));
                }else if (e == 6){
                    t2.setBackgroundColor(getResources().getColor(R.color.blue));
                }else if (e==7){
                    t2.setBackgroundColor(getResources().getColor(R.color.blueviolet));
                }else if (e == 8){
                    t2.setBackgroundColor(getResources().getColor(R.color.gray));
                }else if (d == 9) {
                    t2.setBackgroundColor(getResources().getColor(R.color.white));
                }
        if (f == 10) {
                    t3.setBackgroundColor(getResources().getColor(R.color.black));}
                else if (f ==10E1){
                    t3.setBackgroundColor(getResources().getColor(R.color.maroon));
                }else if (f == 10E2){
                    t3.setBackgroundColor(getResources().getColor(R.color.red));
                }else if (f==10E3){
                    t3.setBackgroundColor(getResources().getColor(R.color.orange));
                }else if (f == 10E4){
                    t3.setBackgroundColor(getResources().getColor(R.color.yellow));
                }else if (f == 10E5){
                    t3.setBackgroundColor(getResources().getColor(R.color.green));
                }else if (f == 10E6){
                    t3.setBackgroundColor(getResources().getColor(R.color.blue));
                }else if (f==10E7){
                    t3.setBackgroundColor(getResources().getColor(R.color.blueviolet));
                }else if (f == 10E8){
                    t3.setBackgroundColor(getResources().getColor(R.color.gray));
                }else if (f == 10E9) {
                    t3.setBackgroundColor(getResources().getColor(R.color.white));
                }




                tout.setText(String.valueOf(c)+" Kohm" +" %"+String.valueOf(g)+"Err:" + "\n" +"\n" + String.valueOf(i)+"K"+ " - " +String.valueOf(j)+"K" );






            }
        });







    }

    @SuppressLint("ResourceAsColor")
    public  void  checkButton(View v) {
        int radioId = radioGroup.getCheckedRadioButtonId();
        int radio1Id = radioGroup4.getCheckedRadioButtonId();
        int radio2Id = radioGroup3.getCheckedRadioButtonId();
        int radio3Id = radioGroup5.getCheckedRadioButtonId();

        radioButton0 = findViewById(radioId);
        radioButton1 = findViewById(radio1Id);
        radioButton2 = findViewById(radio2Id);
        radioButton3 = findViewById(radio3Id);


    }
}
