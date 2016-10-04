package kr.ac.kookmin.cs.twobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View v) {

        float resNum;
        TextView resText=(TextView)findViewById(R.id.ResultText);
        EditText editText = (EditText) findViewById(R.id.editText);

        switch (v.getId()) {
            case R.id.button1:
                MyMinimum myMin = new MyMinimum();

                String inputText = editText.getText().toString();

                String[] str = inputText.split(", ");
                int[] inputNum = new int[str.length];
                for(int i=0; i < str.length; i++)
                    inputNum[i] = Integer.parseInt(str[i]);

                resNum = myMin.getResult(inputNum);
                resText.setText("Result : " + (int)resNum);

                break;
            case R.id.button2:
                MyAverage myAvg = new MyAverage();

                String inputText2 = editText.getText().toString();

                String[] str2 = inputText2.split(", ");
                int[] inputNum2 = new int[str2.length];
                for(int i=0; i<str2.length; i++)
                    inputNum2[i] = Integer.parseInt(str2[i]);

                resNum = myAvg.getResult(inputNum2);
                resText.setText("Result : " + resNum);
                break;
        }
    }
}
