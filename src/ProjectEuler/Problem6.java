package ProjectEuler;

public class Problem6 {

    public static void main(String[] args){
        /*
         * Problem 6: Sum square difference
         * Solution by: Alexander Lay
         * Date: April 30, 2021
         */

        //initialize variables
        int sumOfSquares = 0;
        int squareOfSums = 0;
        int difference = 0;
        int num = 100;

        //create methods object from Methods class
        Methods methods = new Methods();

        sumOfSquares = methods.sumOfSquares(num);
        squareOfSums = methods.squareOfSums(num);
        difference = squareOfSums-sumOfSquares;

        //output answer
        System.out.println("The difference of the sum of the squares and the square of the sum of the first" +
                " onn hundred natural numbers is: " + difference);
    }
}
