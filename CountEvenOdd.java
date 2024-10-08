package Assignment3;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];

        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        
        int evenCount = 0;
        int oddCount = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

       
        System.out.println("Number of Even elements: " + evenCount);
        System.out.println("Number of Odd elements: " + oddCount);

        scanner.close();
    }
}
