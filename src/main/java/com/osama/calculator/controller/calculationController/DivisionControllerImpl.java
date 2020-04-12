package com.osama.calculator.controller.calculationController;

import com.osama.calculator.controller.CalculationController;
import com.osama.calculator.model.operation.Division;
import org.springframework.beans.factory.annotation.Autowired;

public class DivisionControllerImpl implements CalculationController {
    @Autowired
    private Division division;

    public Number executeOperation(Number number1,Number number2){
        try {
           if (number1.doubleValue() == 0){
                throw  new IllegalArgumentException("Cannot divide by zero");
           }
       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }
        return division.divisionOperation(number2,number1);
    }
}
