package com.tutorial.cw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtTitle = findViewById(R.id.txtTitle);
        EditText edtNumber1 = findViewById(R.id.edtNumber);
        EditText edtNumber2 = findViewById( R.id.edtNumber2);
        Button btnCalculate = findViewById(R.id.btnCalculate);
        TextView txtResult = findViewById(R.id.txtResult);



        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(edtNumber1.getText().toString());
                int number2 = Integer.parseInt(edtNumber2.getText().toString());

                int resultText = number1 + number2;
                txtResult.setText(Integer.toString(resultText));
            }
        });


    }
}