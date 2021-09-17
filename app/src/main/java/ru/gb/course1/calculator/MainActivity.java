package ru.gb.course1.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView calculatorScreenTextView;

    Button cleanButton, deleteButton, divideButton, digitZeroButton, digitOneButton, digitTwoButton, digitThreeButton, digitFourButton, digitFiveButton, digitSixButton, digitSevenButton, digitEightButton, digitNineButton,
            multiplyButton, addButton, minusButton, pointButton, equalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculatorScreenTextView = findViewById(R.id.calculator_screen_text_view);

        digitZeroButton = findViewById(R.id.digit_zero_button);
        digitOneButton = findViewById(R.id.digit_one_button);
        digitTwoButton = findViewById(R.id.digit_two_button);
        digitThreeButton = findViewById(R.id.digit_three_button);
        digitFourButton = findViewById(R.id.digit_four_button);
        digitFiveButton = findViewById(R.id.digit_five_button);
        digitSixButton = findViewById(R.id.digit_six_button);
        digitSevenButton = findViewById(R.id.digit_seven_button);
        digitEightButton = findViewById(R.id.digit_eight_button);
        digitNineButton = findViewById(R.id.digit_nine_button);
        multiplyButton = findViewById(R.id.multiply_button);
        divideButton = findViewById(R.id.divide_button);
        addButton = findViewById(R.id.add_button);
        minusButton = findViewById(R.id.minus_button);
        pointButton = findViewById(R.id.point_button);
        deleteButton = findViewById(R.id.delete_button);
        equalButton = findViewById(R.id.equal_button);
        cleanButton = findViewById(R.id.clean_button);


        digitZeroButton.setOnClickListener(view -> {
        });
        digitOneButton.setOnClickListener(view -> {
        });
        digitTwoButton.setOnClickListener(view -> {
        });
        digitThreeButton.setOnClickListener(view -> {
        });
        digitFourButton.setOnClickListener(view -> {
        });
        digitFiveButton.setOnClickListener(view -> {
        });
        digitSixButton.setOnClickListener(view -> {
        });
        digitSevenButton.setOnClickListener(view -> {
        });
        digitEightButton.setOnClickListener(view -> {
        });
        digitNineButton.setOnClickListener(view -> {
        });
        minusButton.setOnClickListener(view -> {
        });
        multiplyButton.setOnClickListener(view -> {
        });
        deleteButton.setOnClickListener(view -> {
        });
        divideButton.setOnClickListener(view -> {
        });
        pointButton.setOnClickListener(view -> {
        });
        addButton.setOnClickListener(view -> {
        });
        equalButton.setOnClickListener(view -> {
        });
        cleanButton.setOnClickListener(view -> {
        });
    }
}