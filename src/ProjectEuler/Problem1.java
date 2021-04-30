package ProjectEuler;


public class Problem1 {

    public static void main(String[] args){
        /*
         * Problem 1: Multiples of 3 and 5
         * Solution by: Alexander Lay
         * Date: April 30, 2021
         */

        //initialize variables
        int[] multiples = {3, 5};
        int limit = 1000;
        int sum = 0;

        //create methods object from Methods class
        Methods methods = new Methods();

        //loop through all numbers up to 1000
        for (int i=1; i<limit; i++){
            sum = methods.sumOfTwoMultiples(sum, multiples, i);
        }

        //output answer
        System.out.println("The sum of multiples of 3 and 5 below 1000 is: " + sum);
    }
}
