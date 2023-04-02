package learning.practice.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DefaultConsumerInterfacePractice {

    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Sydney", "Dhaka", "New York", "London");

        Consumer<List<String>> upperCaseConsumer = list -> {
            for(int i=0; i< list.size(); i++){
                list.set(i, list.get(i).toUpperCase());
            }
        };

        Consumer<List<String>> printConsumer = list ->
                list.stream().forEach(System.out::println);

        /**
         * Statements states two operations:
         * 1. consume the operation
         * 2. and then perform other operation on it.
         */
        upperCaseConsumer.andThen(upperCaseConsumer).accept(cities);

        /*
        accept is basically to perform operation on the object
        upperCaseConsumer.accept(cities);
        for(String city : cities){
            System.out.println("Modified city: "+city);
        }*/
    }
}
