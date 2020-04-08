package com.osama.calculator.model.operation.ImplOperation;

import com.osama.calculator.model.operation.Addition;
import com.osama.calculator.model.operation.Calculation;

public class AdditionImpl extends Calculation implements Addition {
    public Number additionOperation(Number number1, Number number2) {
        this.setNumber1(number1);
        this.setNumber2(number2);
        Number res=number1.doubleValue()+number2.doubleValue();
        this.setResult(res);
        return getResult();
    }

    public void printResult() {
        System.out.println("The result of the addition process : "+this.getResult());
    }
}
