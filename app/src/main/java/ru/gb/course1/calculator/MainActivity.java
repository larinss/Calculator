package ru.gb.course1.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String VALUE_ONE_KEY = "";
    private static final String VALUE_TWO_KEY = "";
    private static final String RESULT_KEY = "";
    private static final String INPUT_VALUE_OF_CALCULATOR_SCREEN_KEY = "";
    private static final String SYMBOL_OPERATION_KEY = "";

    private double valueOne = 0;
    private double valueTwo = 0;
    private double result = 0;
    private String symbolOperation = "";
    private String inputValueOfCalculatorScreen = "";

    TextView calculatorScreenTextView;
    Button cleanButton, deleteButton, divideButton, digitZeroButton, digitOneButton, digitTwoButton, digitThreeButton, digitFourButton, digitFiveButton, digitSixButton, digitSevenButton, digitEightButton, digitNineButton,
            multiplyButton, addButton, minusButton, pointButton, equalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null && savedInstanceState.containsKey(VALUE_ONE_KEY) && savedInstanceState.containsKey(VALUE_TWO_KEY) && savedInstanceState.containsKey(RESULT_KEY) && savedInstanceState.containsKey(INPUT_VALUE_OF_CALCULATOR_SCREEN_KEY) && savedInstanceState.containsKey(SYMBOL_OPERATION_KEY)) {
            valueOne = savedInstanceState.getDouble(VALUE_ONE_KEY);
            valueTwo = savedInstanceState.getDouble(VALUE_TWO_KEY);
            result = savedInstanceState.getDouble(RESULT_KEY);
            inputValueOfCalculatorScreen = savedInstanceState.getString(INPUT_VALUE_OF_CALCULATOR_SCREEN_KEY);
            symbolOperation = savedInstanceState.getString(SYMBOL_OPERATION_KEY);
        }

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
            inputValueOfCalculatorScreen += 0;
            calculatorScreenTextView.setText(inputValueOfCalculatorScreen);
        });
        digitOneButton.setOnClickListener(view -> {
            inputValueOfCalculatorScreen += 1;
            calculatorScreenTextView.setText(inputValueOfCalculatorScreen);
        });
        digitTwoButton.setOnClickListener(view -> {
            inputValueOfCalculatorScreen += 2;
            calculatorScreenTextView.setText(inputValueOfCalculatorScreen);
        });
        digitThreeButton.setOnClickListener(view -> {
            inputValueOfCalculatorScreen += 3;
            calculatorScreenTextView.setText(inputValueOfCalculatorScreen);
        });
        digitFourButton.setOnClickListener(view -> {
            inputValueOfCalculatorScreen += 4;
            calculatorScreenTextView.setText(inputValueOfCalculatorScreen);
        });
        digitFiveButton.setOnClickListener(view -> {
            inputValueOfCalculatorScreen += 5;
            calculatorScreenTextView.setText(inputValueOfCalculatorScreen);
        });
        digitSixButton.setOnClickListener(view -> {
            inputValueOfCalculatorScreen += 6;
            calculatorScreenTextView.setText(inputValueOfCalculatorScreen);
        });
        digitSevenButton.setOnClickListener(view -> {
            inputValueOfCalculatorScreen += 7;
            calculatorScreenTextView.setText(inputValueOfCalculatorScreen);
        });
        digitEightButton.setOnClickListener(view -> {
            inputValueOfCalculatorScreen += 8;
            calculatorScreenTextView.setText(inputValueOfCalculatorScreen);
        });
        digitNineButton.setOnClickListener(view -> {
            inputValueOfCalculatorScreen += 9;
            calculatorScreenTextView.setText(inputValueOfCalculatorScreen);
        });
        minusButton.setOnClickListener(view -> {
            if (symbolOperation.isEmpty() && !inputValueOfCalculatorScreen.isEmpty()) {
                calculatorScreenTextView.setText("-");
                symbolOperation = "-";
                valueOne = Double.parseDouble(inputValueOfCalculatorScreen);
                inputValueOfCalculatorScreen = "";
            }
        });
        multiplyButton.setOnClickListener(view -> {
            if (symbolOperation.isEmpty() && !inputValueOfCalculatorScreen.isEmpty()) {
                calculatorScreenTextView.setText("*");
                symbolOperation = "*";
                valueOne = Double.parseDouble(inputValueOfCalculatorScreen);
                inputValueOfCalculatorScreen = "";
            }
        });
        deleteButton.setOnClickListener(view -> {
            if (inputValueOfCalculatorScreen != null && inputValueOfCalculatorScreen.length() > 0) {
                inputValueOfCalculatorScreen = inputValueOfCalculatorScreen.substring(0, inputValueOfCalculatorScreen.length() - 1);
                calculatorScreenTextView.setText(inputValueOfCalculatorScreen);
            }

        });
        divideButton.setOnClickListener(view -> {
            if (symbolOperation.isEmpty() && !inputValueOfCalculatorScreen.isEmpty()) {
                calculatorScreenTextView.setText("/");
                symbolOperation = "/";
                valueOne = Double.parseDouble(inputValueOfCalculatorScreen);
                inputValueOfCalculatorScreen = "";
            }
        });
        pointButton.setOnClickListener(view -> {
            if (!inputValueOfCalculatorScreen.isEmpty() && !inputValueOfCalculatorScreen.contains(".")) {
                inputValueOfCalculatorScreen += ".";
                calculatorScreenTextView.setText(inputValueOfCalculatorScreen);
            }
        });
        addButton.setOnClickListener(view -> {
            if (symbolOperation.isEmpty() && !inputValueOfCalculatorScreen.isEmpty()) {
                calculatorScreenTextView.setText("+");
                symbolOperation = "+";
                valueOne = Double.parseDouble(inputValueOfCalculatorScreen);
                inputValueOfCalculatorScreen = "";
            }
        });
        equalButton.setOnClickListener(view -> {
            if (valueOne != 0 && !symbolOperation.isEmpty()) {
                valueTwo = Double.parseDouble(inputValueOfCalculatorScreen);
                inputValueOfCalculatorScreen = "";
                if (valueTwo != 0 && symbolOperation.equals("+"))
                    result = valueOne + valueTwo;
                if (symbolOperation.equals("-"))
                    result = valueOne - valueTwo;
                if (symbolOperation.equals("*"))
                    result = valueOne * valueTwo;
                if (symbolOperation.equals("/"))
                    if (valueTwo == 0) {
                        Toast.makeText(this, "На ноль делить нельзя!", Toast.LENGTH_LONG).show();
                        return;
                    } else result = valueOne / valueTwo;

                calculatorScreenTextView.setText(String.valueOf(result));
                inputValueOfCalculatorScreen = "";
                symbolOperation = "";
                valueOne = 0;
                valueTwo = 0;

            }
        });
        cleanButton.setOnClickListener(view -> {
            inputValueOfCalculatorScreen = "";
            calculatorScreenTextView.setText("");
            symbolOperation = "";
            valueOne = 0;
            valueTwo = 0;
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putDouble(VALUE_ONE_KEY, valueOne);
        outState.putDouble(VALUE_TWO_KEY, valueTwo);
        outState.putDouble(RESULT_KEY, result);
        outState.putString(INPUT_VALUE_OF_CALCULATOR_SCREEN_KEY, inputValueOfCalculatorScreen);
        outState.putString(SYMBOL_OPERATION_KEY, symbolOperation);
        super.onSaveInstanceState(outState);

    }


}