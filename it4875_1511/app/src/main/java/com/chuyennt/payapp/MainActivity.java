package com.chuyennt.payapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int temp;
    private String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner);
        EditText editText = findViewById(R.id.editTextTextPersonName);
        Button btHandle = findViewById(R.id.button);
        TextView rs1 = findViewById(R.id.textView4);
        TextView rs2 = findViewById(R.id.textView5);
        TextView rs3 = findViewById(R.id.textView6);
        TextView rs4 = findViewById(R.id.textView7);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                result = "";
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                result = editText.getText().toString();
            }
        });

        btHandle.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                switch (Integer.parseInt(String.valueOf(spinner.getSelectedItem()))) {
                    case 2: {
                        if(result.matches("[01]*")) {
                            temp = Integer.parseInt(result,2);
                            System.out.println(Integer.toOctalString(temp));
                            rs1.setText("Binary : " + Integer.toBinaryString(temp));
                            rs2.setText("Octal : " + Integer.toOctalString(temp));
                            rs3.setText("Decimal : " + temp);
                            rs4.setText("Hex : " + Integer.toHexString(temp));
                            break;
                        }
                        else {
                            Toast.makeText(MainActivity.this, "Syntax Error", Toast.LENGTH_SHORT).show();
                            rs1.setText("Error");
                            rs2.setText("Error");
                            rs3.setText("Error");
                            rs4.setText("Error");
                        }
                        break;
                    }
                    case 8: {
                        if(result.matches("[01234567]*")) {
                            temp = Integer.parseInt(result,8);
                            System.out.println(Integer.toOctalString(temp));
                            rs1.setText("Binary : " + Integer.toBinaryString(temp));
                            rs2.setText("Octal : " + Integer.toOctalString(temp));
                            rs3.setText("Decimal : " + temp);
                            rs4.setText("Hex : " + Integer.toHexString(temp));
                        }
                        else {
                            Toast.makeText(MainActivity.this, "Syntax Error", Toast.LENGTH_SHORT).show();
                            rs1.setText("Error");
                            rs2.setText("Error");
                            rs3.setText("Error");
                            rs4.setText("Error");
                        }
                        break;
                    }
                    case 10: {
                        if(result.matches("[0123456789]*")) {
                            temp = Integer.parseInt(result);
                            System.out.println(Integer.toOctalString(temp));
                            rs1.setText("Binary : " + Integer.toBinaryString(temp));
                            rs2.setText("Octal : " + Integer.toOctalString(temp));
                            rs3.setText("Decimal : " + temp);
                            rs4.setText("Hex : " + Integer.toHexString(temp));
                        }
                        else {
                            Toast.makeText(MainActivity.this, "Syntax Error", Toast.LENGTH_SHORT).show();
                            rs1.setText("Error");
                            rs2.setText("Error");
                            rs3.setText("Error");
                            rs4.setText("Error");
                        }
                        break;
                    }
                    case 16: {
                        if(result.matches("[0123456789abcdef]*")) {
                            temp = Integer.parseInt(result,16);
                            System.out.println(Integer.toOctalString(temp));
                            rs1.setText("Binary : " + Integer.toBinaryString(temp));
                            rs2.setText("Octal : " + Integer.toOctalString(temp));
                            rs3.setText("Decimal : " + temp);
                            rs4.setText("Hex : " + Integer.toHexString(temp));
                        }
                        else {
                            Toast.makeText(MainActivity.this, "Syntax Error", Toast.LENGTH_SHORT).show();
                            rs1.setText("Error");
                            rs2.setText("Error");
                            rs3.setText("Error");
                            rs4.setText("Error");
                        }
                        break;
                    }
                }
            }
        });

    }

}