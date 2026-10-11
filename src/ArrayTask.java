import java.util.Arrays;

public class ArrayTask {
    public static void main(String[] args) {
        //Write a function called runningSum that takes an integer array and returns a new array where each element is the sum of all previous elements including itself:
        int [] numbers = {1,2,3,4,5};
        int sum = 0;
        int [] result = new int[numbers.length];
        for (int index = 0; index < numbers.length; index++) {
                    sum += numbers[index];
                    result[index] = sum;
            }
//Write a function called twoSum that takes an integer array and a target value, and prints the indices of the two numbers that add up to the target:
     int [] numberTwo= {2,7,11,15};
        int target = 9;
        for (int index = 0; index < numberTwo.length; index++) {
            int current = numberTwo[index];
            int x = target - current;
            for(int count = index+1; count < numberTwo.length; count++) {
                if(numberTwo[count] == x){
                   System.out.println("Target number is : " +(current + numberTwo[count]));

                }
            }

        }
        System.out.println(Arrays.toString(result));

        }

    }
