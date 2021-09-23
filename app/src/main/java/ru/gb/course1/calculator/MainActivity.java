package ru.gb.course1.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AlgorithmOfCalculatorButtonsOperation buttonsOperation = new AlgorithmOfCalculatorButtonsOperation();

    private static final String VALUE_ONE_KEY = "valueOne";
    private static final String VALUE_TWO_KEY = "valueTwo";
    private static final String RESULT_KEY = "result";
    private static final String INPUT_VALUE_OF_CALCULATOR_SCREEN_KEY = "inputValueOfCalculatorScreen";
    private static final String SYMBOL_OPERATION_KEY = "symbolOperation";

    TextView calculatorScreenTextView;
    Button cleanButton, deleteButton, divideButton, digitZeroButton, digitOneButton, digitTwoButton,
            digitThreeButton, digitFourButton, digitFiveButton, digitSixButton, digitSevenButton,
            digitEightButton, digitNineButton, multiplyButton, addButton, minusButton, pointButton, equalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null && savedInstanceState.containsKey(VALUE_ONE_KEY)
                && savedInstanceState.containsKey(VALUE_TWO_KEY)
                && savedInstanceState.containsKey(RESULT_KEY)
                && savedInstanceState.containsKey(INPUT_VALUE_OF_CALCULATOR_SCREEN_KEY)
                && savedInstanceState.containsKey(SYMBOL_OPERATION_KEY)) {
            buttonsOperation.valueOne = savedInstanceState.getDouble(VALUE_ONE_KEY);
            buttonsOperation.valueTwo = savedInstanceState.getDouble(VALUE_TWO_KEY);
            buttonsOperation.result = savedInstanceState.getDouble(RESULT_KEY);
            buttonsOperation.inputValueOfCalculatorScreen = savedInstanceState.getString(INPUT_VALUE_OF_CALCULATOR_SCREEN_KEY);
            buttonsOperation.symbolOperation = savedInstanceState.getString(SYMBOL_OPERATION_KEY);

        }

        calculatorScreenTextView = findViewById(R.id.calculator_screen_text_view);
        if (buttonsOperation.symbolOperation.isEmpty())
            calculatorScreenTextView.setText(buttonsOperation.inputValueOfCalculatorScreen);
        else calculatorScreenTextView.setText(buttonsOperation.symbolOperation);

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
            if (buttonsOperation.digitZeroButton())
                calculatorScreenTextView.setText(buttonsOperation.inputValueOfCalculatorScreen);
        });
        digitOneButton.setOnClickListener(view -> {
            if (buttonsOperation.digitOneButton())
                calculatorScreenTextView.setText(buttonsOperation.inputValueOfCalculatorScreen);
        });
        digitTwoButton.setOnClickListener(view -> {
            if (buttonsOperation.digitTwoButton())
                calculatorScreenTextView.setText(buttonsOperation.inputValueOfCalculatorScreen);
        });
        digitThreeButton.setOnClickListener(view -> {
            if (buttonsOperation.digitThreeButton())
                calculatorScreenTextView.setText(buttonsOperation.inputValueOfCalculatorScreen);
        });
        digitFourButton.setOnClickListener(view -> {
            if (buttonsOperation.digitFourButton())
                calculatorScreenTextView.setText(buttonsOperation.inputValueOfCalculatorScreen);
        });
        digitFiveButton.setOnClickListener(view -> {
            if (buttonsOperation.digitFiveButton())
                calculatorScreenTextView.setText(buttonsOperation.inputValueOfCalculatorScreen);
        });
        digitSixButton.setOnClickListener(view -> {
            if (buttonsOperation.digitSixButton())
                calculatorScreenTextView.setText(buttonsOperation.inputValueOfCalculatorScreen);
        });
        digitSevenButton.setOnClickListener(view -> {
            if (buttonsOperation.digitSevenButton())
                calculatorScreenTextView.setText(buttonsOperation.inputValueOfCalculatorScreen);
        });
        digitEightButton.setOnClickListener(view -> {
            if (buttonsOperation.digitEightButton())
                calculatorScreenTextView.setText(buttonsOperation.inputValueOfCalculatorScreen);
        });
        digitNineButton.setOnClickListener(view -> {
            if (buttonsOperation.digitNineButton())
                calculatorScreenTextView.setText(buttonsOperation.inputValueOfCalculatorScreen);
        });
        minusButton.setOnClickListener(view -> {
            if (buttonsOperation.minusButton())
                calculatorScreenTextView.setText(buttonsOperation.symbolOperation);
        });
        multiplyButton.setOnClickListener(view -> {
            if (buttonsOperation.multiplyButton())
                calculatorScreenTextView.setText(buttonsOperation.symbolOperation);
        });
        deleteButton.setOnClickListener(view -> {
            buttonsOperation.deleteButton();
            calculatorScreenTextView.setText(buttonsOperation.inputValueOfCalculatorScreen);

        });
        divideButton.setOnClickListener(view -> {
            if (buttonsOperation.divideButton())
                calculatorScreenTextView.setText(buttonsOperation.symbolOperation);
        });
        pointButton.setOnClickListener(view -> {
            if (buttonsOperation.pointButton())
                calculatorScreenTextView.setText(buttonsOperation.inputValueOfCalculatorScreen);
        });
        addButton.setOnClickListener(view -> {
            if (buttonsOperation.addButton())
                calculatorScreenTextView.setText(buttonsOperation.symbolOperation);
        });
        equalButton.setOnClickListener(view -> {
            buttonsOperation.equalButton();
            calculatorScreenTextView.setText(String.valueOf(buttonsOperation.result));

        });
        cleanButton.setOnClickListener(view -> {
            buttonsOperation.cleanButton();
            calculatorScreenTextView.setText("");
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putDouble(VALUE_ONE_KEY, buttonsOperation.valueOne);
        outState.putDouble(VALUE_TWO_KEY, buttonsOperation.valueTwo);
        outState.putDouble(RESULT_KEY, buttonsOperation.result);
        outState.putString(INPUT_VALUE_OF_CALCULATOR_SCREEN_KEY, buttonsOperation.inputValueOfCalculatorScreen);
        outState.putString(SYMBOL_OPERATION_KEY, buttonsOperation.symbolOperation);
        super.onSaveInstanceState(outState);

    }


}