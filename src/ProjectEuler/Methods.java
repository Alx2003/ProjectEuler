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

    //determines if a number is divisible by all elements of an array
    //used in Problem 5
    public static boolean divisibilityCheck(int number, int rangeMax){
        for (int i=rangeMax; i>=1; i--){
            if(number%i!=0){
                return false;
            }
        }
        return true;
    }

    //determines the sum of the squares of previous numbers
    //used in Problem 6
    public static int sumOfSquares(int num){
        int sumOfSquares = 0;
        for (int i=1; i<=100; i++){
            sumOfSquares += i*i;
        }
        return sumOfSquares;
    }

    //determines the square of the sums of previous numbers
    //used in Problem 6
    public static int squareOfSums(int num){
        int squareOfSums = 0;
        for (int i=1; i<=100; i++){
            squareOfSums += i;
        }
        squareOfSums *= squareOfSums;
        return squareOfSums;
    }
}
