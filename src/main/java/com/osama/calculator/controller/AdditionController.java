package com.osama.calculator.controller;
import com.osama.calculator.model.operation.Addition;
import com.osama.calculator.model.operation.ImplOperation.AdditionImpl;
import com.osama.calculator.model.operation.Operation;

public class AdditionController {
    private Addition addition;

    public Number addition(Number number1,Number number2){
        return addition.additionOperation(number1,number2);
    }

}
