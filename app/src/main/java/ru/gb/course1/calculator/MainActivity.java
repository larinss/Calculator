package ru.gb.course1.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView calculatorScreenTextView;

    Button btnClean, btnDel, btnDivide, btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine,
            btnMultiply, btnAdd, btnMinus, btnPoint, btnEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculatorScreenTextView = findViewById(R.id.calculator_screen_text_view);

        btnZero = findViewById(R.id.btn_0);
        btnOne = findViewById(R.id.btn_1);
        btnTwo = findViewById(R.id.btn_2);
        btnThree = findViewById(R.id.btn_3);
        btnFour = findViewById(R.id.btn_4);
        btnFive = findViewById(R.id.btn_5);
        btnSix = findViewById(R.id.btn_6);
        btnSeven = findViewById(R.id.btn_7);
        btnEight = findViewById(R.id.btn_8);
        btnNine = findViewById(R.id.btn_9);
        btnMultiply = findViewById(R.id.btn_multiply);
        btnDivide = findViewById(R.id.btn_divide);
        btnAdd = findViewById(R.id.btn_add);
        btnMinus = findViewById(R.id.btn_minus);
        btnPoint = findViewById(R.id.btn_point);
        btnDel = findViewById(R.id.btn_del);
        btnEqual = findViewById(R.id.btn_equal);
        btnClean = findViewById(R.id.btn_clean);


        btnZero.setOnClickListener(view -> {
        });
        btnOne.setOnClickListener(view -> {
        });
        btnTwo.setOnClickListener(view -> {
        });
        btnThree.setOnClickListener(view -> {
        });
        btnFour.setOnClickListener(view -> {
        });
        btnFive.setOnClickListener(view -> {
        });
        btnSix.setOnClickListener(view -> {
        });
        btnSeven.setOnClickListener(view -> {
        });
        btnEight.setOnClickListener(view -> {
        });
        btnNine.setOnClickListener(view -> {
        });
        btnMinus.setOnClickListener(view -> {
        });
        btnMultiply.setOnClickListener(view -> {
        });
        btnDel.setOnClickListener(view -> {
        });
        btnDivide.setOnClickListener(view -> {
        });
        btnPoint.setOnClickListener(view -> {
        });
        btnAdd.setOnClickListener(view -> {
        });
        btnEqual.setOnClickListener(view -> {
        });
        btnClean.setOnClickListener(view -> {
        });
    }
}