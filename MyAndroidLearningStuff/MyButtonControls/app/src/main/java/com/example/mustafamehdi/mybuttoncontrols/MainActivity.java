package com.example.mustafamehdi.mybuttoncontrols;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    TextView tv;
    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MyfirstButtonClick(View v)
    {
        tv=(TextView)findViewById(R.id.displayTxt);
        btn1=(Button)findViewById(R.id.FirstBtn);
        tv.setText(btn1.getText().toString());

    }
}
