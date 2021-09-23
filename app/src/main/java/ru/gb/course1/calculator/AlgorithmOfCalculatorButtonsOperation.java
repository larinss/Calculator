package ru.gb.course1.calculator;


public class AlgorithmOfCalculatorButtonsOperation {

    public double valueOne = 0;
    public double valueTwo = 0;
    public double result = 0;
    public String symbolOperation = "";
    public String inputValueOfCalculatorScreen = "";


    public boolean digitZeroButton() {
        if (inputValueOfCalculatorScreen.length() <= 7) {
            inputValueOfCalculatorScreen += 0;
            return true;
        }
        return false;
    }

    public boolean digitOneButton() {
        if (inputValueOfCalculatorScreen.length() <= 7) {
            inputValueOfCalculatorScreen += 1;
            return true;
        }
        return false;
    }

    public boolean digitTwoButton() {
        if (inputValueOfCalculatorScreen.length() <= 7) {
            inputValueOfCalculatorScreen += 2;
            return true;
        }
        return false;
    }

    public boolean digitThreeButton() {
        if (inputValueOfCalculatorScreen.length() <= 7) {
            inputValueOfCalculatorScreen += 3;
            return true;
        }
        return false;
    }

    public boolean digitFourButton() {
        if (inputValueOfCalculatorScreen.length() <= 7) {
            inputValueOfCalculatorScreen += 4;
            return true;
        }
        return false;
    }

    public boolean digitFiveButton() {
        if (inputValueOfCalculatorScreen.length() <= 7) {
            inputValueOfCalculatorScreen += 5;
            return true;
        }
        return false;
    }

    public boolean digitSixButton() {
        if (inputValueOfCalculatorScreen.length() <= 7) {
            inputValueOfCalculatorScreen += 6;
            return true;
        }
        return false;
    }

    public boolean digitSevenButton() {
        if (inputValueOfCalculatorScreen.length() <= 7) {
            inputValueOfCalculatorScreen += 7;
            return true;
        }
        return false;
    }

    public boolean digitEightButton() {
        if (inputValueOfCalculatorScreen.length() <= 7) {
            inputValueOfCalculatorScreen += 8;
            return true;
        }
        return false;
    }

    public boolean digitNineButton() {
        if (inputValueOfCalculatorScreen.length() <= 7) {
            inputValueOfCalculatorScreen += 9;
            return true;
        }
        return false;
    }

    public boolean divideButton() {
        if (symbolOperation.isEmpty() && !inputValueOfCalculatorScreen.isEmpty()) {
            symbolOperation = "/";
            valueOne = Double.parseDouble(inputValueOfCalculatorScreen);
            inputValueOfCalculatorScreen = "/";
            return true;
        }
        return false;
    }

    public boolean multiplyButton() {
        if (symbolOperation.isEmpty() && !inputValueOfCalculatorScreen.isEmpty()) {
            symbolOperation = "*";
            valueOne = Double.parseDouble(inputValueOfCalculatorScreen);
            inputValueOfCalculatorScreen = "*";
            return true;
        }
        return false;
    }

    public boolean minusButton() {
        if (symbolOperation.isEmpty() && !inputValueOfCalculatorScreen.isEmpty()) {
            symbolOperation = "-";
            valueOne = Double.parseDouble(inputValueOfCalculatorScreen);
            inputValueOfCalculatorScreen = "-";
            return true;
        }
        return false;
    }

    public boolean addButton() {
        if (symbolOperation.isEmpty() && !inputValueOfCalculatorScreen.isEmpty()) {
            symbolOperation = "+";
            valueOne = Double.parseDouble(inputValueOfCalculatorScreen);
            inputValueOfCalculatorScreen = "+";
            return true;
        }
        return false;
    }

    public boolean pointButton() {
        if (inputValueOfCalculatorScreen.length() <= 7) {
            inputValueOfCalculatorScreen += ".";
            return true;
        }
        return false;
    }

    public void deleteButton() {
        inputValueOfCalculatorScreen = inputValueOfCalculatorScreen.substring(0, inputValueOfCalculatorScreen.length() - 1);
    }

    public void cleanButton() {
        valueOne = 0;
        valueTwo = 0;
        result = 0;
        symbolOperation = "";
        inputValueOfCalculatorScreen = "";
    }

    public void equalButton() {
        if (valueOne != 0 && !symbolOperation.isEmpty()) {
            valueTwo = Double.parseDouble(inputValueOfCalculatorScreen);
            if (valueTwo != 0 && symbolOperation.equals("+"))
                result = valueOne + valueTwo;
            if (symbolOperation.equals("-"))
                result = valueOne - valueTwo;
            if (symbolOperation.equals("*"))
                result = valueOne * valueTwo;
            if (symbolOperation.equals("/"))
                result = valueOne / valueTwo;

            inputValueOfCalculatorScreen = String.valueOf(result);
            symbolOperation = "";
            valueOne = 0;
            valueTwo = 0;
        }
    }
}
