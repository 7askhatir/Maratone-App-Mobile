package com.example.basma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=(TextView) findViewById(R.id.textView);
        Button btn = (Button) findViewById(R.id.button4);
        EditText editText   = (EditText)findViewById(R.id.text1);
        EditText editText2= (EditText)findViewById(R.id.text2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText( editText.getText().toString() +" " +editText2.getText().toString() +"Ans");
                editText.setVisibility(View.INVISIBLE);
                editText2.setVisibility(View.INVISIBLE);
                btn.setVisibility(View.INVISIBLE);
            }
        });
    }
}