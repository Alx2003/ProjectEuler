package ProjectEuler;

public class Problem3 {

    public static void main(String[] args){
        /*
         * Problem 3: Largest prime factor
         * Solution by: Alex Lay
         * Date: April 30, 2021
         */

        //initialize variables
        long number = 600851475143L;
        long largestPrimeFactor = number;

        //declare methods from Methods class
        Methods methods = new Methods();

        largestPrimeFactor = methods.largestPrimeFactor(number);

        //output answer
        System.out.println("The largest prime factor of " + number + " is: " + largestPrimeFactor);
    }
}
