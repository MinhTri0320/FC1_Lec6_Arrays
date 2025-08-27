package Lec6_Arrays;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.print("Enter the number X to find: ");
        int x = scanner.nextInt();
        int[] array = {2, 5, 6, 5, 2, 5};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("The number " + x + " appears " + count + " times.");
        } else {
            System.out.println("The number " + x + " does not appear in the array.");
        }
    }
}
