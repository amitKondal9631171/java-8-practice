package learning.practice.lambda;

import learning.practice.functionalinterface.ParameterLessFunctionalInterface;

public class ParameterLessExpressions {

    public static void main(String[] args) {

        ParameterLessFunctionalInterface expression = () -> System.out.println("Expression executed......");

        expression.test();

    }
}
