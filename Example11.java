package Lec6_Arrays;
import java.util.Scanner;
public class Example11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n1 = Integer.parseInt(s.nextLine());
        int[] num1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.print("Enter " + (i + 1) + "'s number: ");
            num1[i] = s.nextInt();
        }
        int max1 = num1[0];
        int max2 = num1[0];
        for (int i = 0; i < n1; i++) {
            if (num1[i] > max1) {
                max1 = num1[i];
            }
        }       
        for (int i = 0; i < n1; i++) {
            if (num1[i] < max1 && num1[i] > max2) {
                max2 = num1[i];
            }
        }
        System.out.print("Array List: ");
        for (int i = 0; i < n1; i++) {
            System.out.print(num1[i] + " ");
        }
        System.out.println();
        System.out.println("The largest number: " + max1);
        System.out.println("The second largest number: " + max2);
    }
}