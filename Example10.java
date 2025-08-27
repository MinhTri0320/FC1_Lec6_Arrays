package Lec6_Arrays;
import java.util.Scanner;
public class Example10 {
    public static int[] concatenate(int[] a1, int[] a2) {
        int[] r = new int[a1.length + a2.length];// Copy phần tử của a1 vào r
        for (int i = 0; i < a1.length; i++) {
            r[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            r[a1.length + i] = a2[i];
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cac phan tu a1: ");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        System.out.print("Nhap a1: ");
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.print("Nhap cac phan tu a2: ");
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        System.out.print("Nhap a2: ");
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        int[] arr = concatenate(a1, a2);
        System.out.print("Mang sau khi noi: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

