package learning.practice.lambda;

import learning.practice.functionalinterface.BasicMathsOperationsInterface;

public class BasicMathsOperationsImpl {


    static int subraction(int a, int b){
       return a-b;
    }

    static void methodReferencePractice(BasicMathsOperationsInterface multiplicationOperation, int a, int b){
        int result = multiplicationOperation.performOperation(a,b);
        System.out.println(result);
    }


    public static void main(String[] args) {

        //Custom method reference
        methodReferencePractice(BasicMathsOperationsImpl::subraction, 40, 5);
        //method as reference from default Integer class
        methodReferencePractice(Integer::sum, 10, 11);

    }
}
