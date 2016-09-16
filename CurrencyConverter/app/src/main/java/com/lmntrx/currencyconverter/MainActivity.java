package com.lmntrx.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        EditText amountEditText=(EditText) findViewById(R.id.amount);
        String amt=amountEditText.getText().toString();
        int usd = Integer.parseInt(amt);

        if(usd>0)
        {
            Toast.makeText(MainActivity.this,"amount in Rs ="+usd*65,Toast.LENGTH_SHORT).show();

        }
    }
}
