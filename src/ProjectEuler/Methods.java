package ProjectEuler;

public class Methods {

    //accumulates term to running sum if it is a multiple of either key numbers
    //used in Problem 1
    public static int sumOfTwoMultiples(int currentSum, int[] multiples, int currentNum){
        if (currentNum%multiples[0]==0 || currentNum%multiples[1]==0){
            currentSum += currentNum;
        }
        return currentSum;
    }

    //determines next term of Fibonacci sequence up and accumulates term if even
    //used in Problem 2
    public static int[] evenFibonacciAccumulator(int[] inputs){
        int[] returnArray = {inputs[0], inputs[1], inputs[2]};
        int sumOfNums = 0;

        //calculate next terms of Fibonacci sequence and store values
        sumOfNums = inputs[0]+inputs[1];
        returnArray[0] = inputs[1];
        returnArray[1] = sumOfNums;

        //determine if newest term is even
        if (sumOfNums%2==0){
            inputs[2] += sumOfNums;
            returnArray[2] = inputs[2];
        }
        return returnArray;
    }

    //determines largest prime factor of a given long
    //used in Problem 3
    public static long largestPrimeFactor(long number){
        long largestPrimeFactor = number;

        //finding highest factor of highest factor...
        for (int i=2; i!= largestPrimeFactor; i++){
            if (largestPrimeFactor%i==0){
                largestPrimeFactor = largestPrimeFactor/i;
            }
        }
        return largestPrimeFactor;
    }

    //creates a palindrome number by mirroring a given input
    //used in Problem 4
   public static int palindromeCreator(int number){
        int palindrome = 0;
        palindrome = Integer.valueOf(Integer.toString(number)+Integer.toString(number).charAt(2)+
                Integer.toString(number).charAt(1)+Integer.toString(number).charAt(0));
        return palindrome;
   }
}
