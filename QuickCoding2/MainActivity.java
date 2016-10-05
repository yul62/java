package com.example.administrator.bingo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText input;
    TextView res;
    TextView cnt;
    Random random = new Random();
    int start, end, count,num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText)findViewById(R.id.inputNum);
        res = (TextView)findViewById(R.id.res);
        cnt = (TextView)findViewById(R.id.count);

    }

    public void onClick(View v){
       // String str = input.getText().toString();
        //int inputNum = Integer.parseInt(str);


        switch (v.getId()){
            case R.id.send:
                start=1;end=1000;count =1;
                num = (int)(Math.random()*(end -start + 1)) + start;
                res.setText("Your Number is "+num);
                cnt.setText("");
                break;

            case R.id.bigger:
                start = num + 1;
                num = (int)(Math.random()*(end -start + 1)) + start;
                res.setText("Your Number is "+num);
                count++;
                break;
            case R.id.smaller:
                end = num - 1;
                num = (int)(Math.random()*( end-start + 1)) + start;
                res.setText("Your Number is "+num);
                count++;
                break;
            case R.id.bingo:
                cnt.setText("Bingo! count : "+count);
                break;
        }
    }
}
