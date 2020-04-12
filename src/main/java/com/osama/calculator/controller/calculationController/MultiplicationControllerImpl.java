package com.osama.calculator.controller.calculationController;

import com.osama.calculator.controller.CalculationController;
import com.osama.calculator.model.operation.Multiplication;
import org.springframework.beans.factory.annotation.Autowired;

public class MultiplicationControllerImpl implements CalculationController {
    @Autowired
    private Multiplication multiplication;

    public Number executeOperation(Number number1,Number number2){
        return multiplication.multiplicationOperation(number1,number2);
    }
}
