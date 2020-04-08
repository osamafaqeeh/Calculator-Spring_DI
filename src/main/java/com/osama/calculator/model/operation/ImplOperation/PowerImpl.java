package com.osama.calculator.model.operation.ImplOperation;

import com.osama.calculator.model.operation.Calculation;
import com.osama.calculator.model.operation.Power;

public class PowerImpl extends Calculation implements Power {
    public Number powerOperation(Number number1, Number number2) {
        this.setNumber1(number1);
        this.setNumber2(number2);
        Number res =Math.pow(number1.doubleValue(),number2.doubleValue());
        this.setResult(res);
        return this.getResult();
    }

    public void printResult() {
        System.out.println("The result of the Power process : "+this.getResult());

    }
}
