package learning.practice.lambda;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class DefaultFunctionInterfacePractice {

    public static void main(String[] args) {

        ToIntFunction<String> functionOperation = String::length;
        System.out.println(functionOperation.applyAsInt("Amit"));

        String[] countries = {"India", "Australia", "England", "South Africa", "Srilanka", "Newzealand", "West Indies", "Scotland"};
        Function<String[], String> converter = all -> {
            String names = "";
            for(String n : all) {
                String result = n.substring(0, n.indexOf(""));
                result = n.substring(n.indexOf("")) + " " + result;
                names += result + "\n";
            }
            return names;
        };
        System.out.println(converter.apply(countries));
    }
}
