package com.osama.calculator.controller.calculationController;

import com.osama.calculator.controller.CalculationController;
import com.osama.calculator.model.operation.Subtraction;
import org.springframework.beans.factory.annotation.Autowired;

public class SubtractionControllerImpl implements CalculationController {
    @Autowired
    private Subtraction subtraction;

    public Number executeOperation(Number number1,Number number2){
        return subtraction.subtractionOperation(number1,number2);
    }
}

