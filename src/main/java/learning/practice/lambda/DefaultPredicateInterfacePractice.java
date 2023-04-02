package learning.practice.lambda;

import java.util.function.Predicate;

public class DefaultPredicateInterfacePractice {

    public static void main(String[] args) {

        String[] countries = {"India", "Australia", "England", "South Africa", "Srilanka", "Newzealand", "West Indies", "Scotland"};

        Predicate<String[]> predicate = input -> {
               return input.length>5;
        };

        System.out.println(predicate.test(countries));
    }
}
