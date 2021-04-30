package ProjectEuler;

public class Methods {

    //accumulates term to running sum if it is a multiple of either key numbers
    public static int sumOfTwoMultiples(int currentSum, int[] multiples, int currentNum){
        if (currentNum%multiples[0]==0 || currentNum%multiples[1]==0){
            currentSum += currentNum;
        }
        return currentSum;
    }

    //determines next term of Fibonacci sequence up and accumulates term if even
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

}
