package learning.practice.lambda;

import learning.practice.functionalinterface.FunctionalInterface01;

public class LambdaExpression01 {

    public static void main(String[] args) {

        FunctionalInterface01 expression01 = System.out::println;
        expression01.test("String parameter expression executed with method reference.... ");

        FunctionalInterface01 expression02 = str -> System.out.println(str);
        expression02.test("String parameter expression executed.... ");
    }
}
