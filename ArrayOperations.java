package Assignment3;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, 6}; 

        int max = findMax(array);
        double average = calculateAverage(array);

        System.out.println("Maximum Element: " + max);
        System.out.println("Average of Elements: " + average);

        reverseArray(array);
        System.out.print("Reversed Array: ");
        printArray(array);
    }

   
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

   
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


