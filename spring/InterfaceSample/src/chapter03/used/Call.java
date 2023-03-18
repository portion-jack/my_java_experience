package chapter03.used;

import chapter03.used.AddCalc;
import chapter03.used.SubCalc;
import chapter03.used.Calculator;

public class Call {
    public static void main(String[] args){
        Calculator calculator = new SubCalc();
        Integer result = calculator.calc(10,5);
        System.out.println("계산 결과는 (" + result + ")입니다.");
    }
}
