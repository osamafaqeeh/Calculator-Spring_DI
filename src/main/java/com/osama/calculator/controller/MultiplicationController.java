package com.osama.calculator.controller;

import com.osama.calculator.model.operation.Multiplication;

public class MultiplicationController {
    private Multiplication multiplication;

    public Number addition(Number number1,Number number2){
        return multiplication.multiplicationOperation(number1,number2);
    }
}
