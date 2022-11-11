package com.example.widgetdemos;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.home_layout);
    }

    public void goToCheckAct(View view){
        Intent intent = new Intent(this, CheckBoxDemo.class);
        startActivity(intent);
    }

    public void goToRadioAct(View view){
        Intent intent = new Intent(this, RadioButtonDemo.class);
        startActivity(intent);
    }

    public void goToButtons(View view){
        Intent intent = new Intent(this, ButtonPercents.class);
        startActivity(intent);
    }

    public void goToLinearLayout(View view){
        Intent intent = new Intent(this, LinearLayoutDemo.class);
        startActivity(intent);
    }

    public void goToScrollwork(View view){
        Intent intent = new Intent(this, Scrollwork.class);
        startActivity(intent);
    }

    public void goToNowRedux(View view){
        Intent intent = new Intent(this, NowRedux.class);
        startActivity(intent);
    }

    public void goToTableLayout(View view){
        Intent intent = new Intent(this, TableLayoutDemo.class);
        startActivity(intent);
    }

    public void goToOverlap(View view){
        Intent intent = new Intent(this, Overlap.class);
        startActivity(intent);
    }

}