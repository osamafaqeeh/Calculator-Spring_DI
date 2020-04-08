package com.osama.calculator.controller;

import com.osama.calculator.model.operation.Power;

public class PowerController {
    private Power power;

    public Number addition(Number number1,Number number2){
        return power.powerOperation(number1,number2);
    }
}
