package ProjectEuler;

public class Problem5 {

    public static void main(String[] args){
        /*
         * Problem 5: Smallest multiple
         * Solution by: Alexander Lay
         * Date: April 30, 2021
         */

        //initialize variables
        int rangeMax = 20;
        int smallestDivisibleNum = 0;
        boolean numFound = false;

        //create methods object from Methods class
        Methods methods = new Methods();

        for (int i=1; ;i++){
            numFound = methods.divisibilityCheck(i, rangeMax);
            if (numFound){
                smallestDivisibleNum = i;
                break;
            }
        }

        //output answer
        System.out.println("The smallest number that is evenly divisible by numbers 1 to " + rangeMax + " is: "
                + smallestDivisibleNum);
    }
}
