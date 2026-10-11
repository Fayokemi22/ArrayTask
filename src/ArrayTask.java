import java.util.Arrays;
//Write a function called runningSum that takes an integer array and returns a new array where each element is the sum of all previous elements including itself:

public class ArrayTask {
    public static int[] getRunningSum(int[] numbers) {
        int sum = 0;
        int[] result = new int[numbers.length];
        for (int index = 0; index < numbers.length; index++) {
            sum += numbers[index];
            result[index] = sum;
        }
        return result;
    }
    //Write a function called twoSum that takes an integer array and a target value, and prints the indices of the two numbers that add up to the target:
    public static int getTwoSum(int[] numberTwo) {
        int targetNumber = 9;
        for (int index = 0; index < numberTwo.length; index++) {
            int current = numberTwo[index];
            int x = targetNumber - current;
            for(int count = index+1; count < numberTwo.length; count++) {
                if(numberTwo[count] == x)
                   return (current + numberTwo[count]);


            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};

     int [] secondNumber= {2,7,11,15};

        System.out.println(Arrays.toString(getRunningSum(numbers)));
        System.out.println("The target number is: " + (getTwoSum(secondNumber)));

        }

    }
