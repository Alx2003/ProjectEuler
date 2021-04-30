package ProjectEuler;

public class Problem4 {

    public static void main(String[] args){
        /*
         * Problem 4: Largest palindrome product
         * Solution by: Alexander Lay
         * Date: April 30, 2021
         */

        //initialize variables
        int currentPalindrome;
        int largestPalindrome = 0;
        boolean largestPalindromeFound = false;

        //create methods object from Methods class
        Methods methods = new Methods();

        //loop through all possible 3-digit numbers to create palindromes
        for (int i=999; i>=100; i--){
            currentPalindrome = methods.palindromeCreator(i);

            //loop through all possible 3-digit numbers to divide by
            for (int n=999; n>=100; n--){
                //if division results in whole 3-digit number, palindrome = largestPalindrome
                if ((currentPalindrome%n==0)&&(currentPalindrome/n<1000 && currentPalindrome/n>99)){
                    largestPalindrome = currentPalindrome;
                    largestPalindromeFound = !largestPalindromeFound;
                    break;
                }
            }

            if (largestPalindromeFound){
                break;
            }
        }

        //output answer
        System.out.println("The largest possible palindrome that is a product of two 3-digit numbers is: "
                + largestPalindrome);
    }
}
