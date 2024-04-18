package com.example.ui_ci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mul;
    private EditText et1, et2;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mul=findViewById(R.id.mul);

        et1 = findViewById(R.id.editTextNumberDecimal);
        et2 = findViewById(R.id.editTextNumberDecimal2);
        tv = findViewById(R.id.textView);

        mul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                float num1 = Integer.parseInt(et1.getText().toString());
                float num2 = Integer.parseInt(et2.getText().toString());

                float num3 = num1 * num2;
                tv.setText(String.valueOf(num3));

            }
        });

    }
}