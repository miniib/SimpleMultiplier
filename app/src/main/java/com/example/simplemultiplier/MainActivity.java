package com.example.simplemultiplier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int number = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementNumber(View view)
    {
        number++;
        updateNumberView();

    }

    public void decrementNumber(View view)
    {
        number=number-1;
        if (number<=0){
            number=0;
        }
        updateNumberView();
    }


    public void updateNumberView()
    {
        TextView numberView = (TextView) findViewById(R.id.numberView);
        numberView.setText(String.valueOf(number));
    }

    public void calculateResult(View view)
    {
        int result;
        result = number*3;
        TextView ResultView = (TextView) findViewById(R.id.resultView);
        ResultView.setText(String.valueOf(result));
    }
}
