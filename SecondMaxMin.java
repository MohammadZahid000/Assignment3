package Assignment3;

import java.util.Arrays;

public class SecondMaxMin {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, 6, 8}; 

        int secondMax = findSecondMax(array);
        int secondMin = findSecondMin(array);

        System.out.println("Second Maximum Element: " + secondMax);
        System.out.println("Second Minimum Element: " + secondMin);
    }

    
    public static int findSecondMax(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        return secondMax; 
    }

    
    public static int findSecondMin(int[] array) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num > min) {
                secondMin = num;
            }
        }

        return secondMin; 
    }
}


