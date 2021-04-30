package ProjectEuler;

public class Problem2 {

    public static void main(String[] args){
        /*
         * Problem 2: Even Fibonacci numbers
         * Solution by: Alex Lay
         * Date: April 30, 2021
         */

        //initialize variables
        int sumOfEvenNums = 0;
        int limit = 4000000;
        int[] methodArray = {0, 1, sumOfEvenNums};

        //declare methods from Methods class
        Methods methods = new Methods();

        //loop through numbers that are less than 4000000
        while (methodArray[1]<=4000000){
            methodArray = methods.evenFibonacciAccumulator(methodArray);
        }

        //output answer
        System.out.println("The sum of even terms of the Fibonacci sequence that do not exceed" +
                " 4000000 is: " + methodArray[2]);
    }
}
