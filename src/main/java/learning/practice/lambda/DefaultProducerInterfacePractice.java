package learning.practice.lambda;

import java.util.function.Supplier;

public class DefaultProducerInterfacePractice {

    public static void main(String[] args) {
        //can not take argument
        Supplier<Integer> doubleSupplier = BasicMathsOperationsImpl::methodReferencePractice;

        System.out.println(doubleSupplier.get());
    }
}
