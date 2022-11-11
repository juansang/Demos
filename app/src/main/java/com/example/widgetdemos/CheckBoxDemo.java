package com.example.widgetdemos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class CheckBoxDemo extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    CheckBox cb;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_checkbox);

        cb=(CheckBox)findViewById(R.id.check);
        cb.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
        if (isChecked) {
            cb.setText("This checkbox is: checked");
        }
        else {
            cb.setText("This checkbox is: unchecked");
        }
    }
}