package com.osama.calculator.controller.calculationController;

import com.osama.calculator.controller.CalculationController;
import com.osama.calculator.model.operation.Power;
import org.springframework.beans.factory.annotation.Autowired;

public class PowerControllerImpl implements CalculationController {
    @Autowired
    private Power power;

    public Number executeOperation(Number number1,Number number2){
        return power.powerOperation(number1,number2);
    }
}
