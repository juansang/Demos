package com.example.widgetdemos;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Date;
public class NowRedux extends Activity
        implements View.OnClickListener {
    Button btn;
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        setContentView(R.layout.now_redux_layout);
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(this);
        updateTime();
    }
    public void onClick(View view) {
        updateTime();
    }
    private void updateTime() {
        btn.setText(new Date().toString());
    }
}