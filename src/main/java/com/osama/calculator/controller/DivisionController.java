package com.osama.calculator.controller;

import com.osama.calculator.model.operation.Division;

public class DivisionController {
    private Division division;

    public Number addition(Number number1,Number number2){
        return division.divisionOperation(number1,number2);
    }
}
