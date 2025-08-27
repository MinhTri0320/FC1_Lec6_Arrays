package Lec6_Arrays;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap day trong mang: ");
        int n=sc.nextInt();
        int t[]=new int[n];
        System.out.print("Nhap " + n + " mang: ");
        for(int i=0; i<n; i++){
            t[i]=sc.nextInt();
        }
        for(int i=0; i<n / 2; i++){
            int temp = t[i];
            t[i]=t[n-1-i];
            t[n-1-i]=temp;  
        }
        System.out.print("Array after reversal: ");
        for(int i=0; i<n; i++){
            System.out.println(t[i] + " ");
        }
    }
}
