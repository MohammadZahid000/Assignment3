package Assignment3;

public class ArrayStats {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, 6};
        int max = findMax(array);
        double average = calculateAverage(array);

        System.out.println("Maximum Element: " + max);
        System.out.println("Average of Elements: " + average);
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
}


