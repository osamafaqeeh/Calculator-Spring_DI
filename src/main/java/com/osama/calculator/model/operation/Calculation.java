package com.osama.calculator.model.operation;

public class Calculation {
    private Number number1;
    private Number number2;
    private Number result;

    public Number getNumber1() {
        return number1;
    }

    public void setNumber1(Number number1) {
        this.number1 = number1;
    }

    public Number getNumber2() {
        return number2;
    }

    public void setNumber2(Number number2) {
        this.number2 = number2;
    }

    public Number getResult() {
        return result;
    }

    public void setResult(Number result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Calculation{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                ", result=" + result +
                '}';
    }
}
