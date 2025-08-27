package Lec6_Arrays;
import java.util.Scanner;
public class Example13 {
    public static int[] merge(int[] a1, int[] a2) {
        int n1 = a1.length;
        int n2 = a2.length;
        int[] r = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (a1[i] <= a2[j]) {
                r[k] = a1[i];
                i++;
            } else {
                r[k] = a2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            r[k] = a1[i];
            i++;
            k++;
        }
        while (j < n2) {
            r[k] = a2[j];
            j++;
            k++;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang a1: ");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        System.out.print("Nhap a1(tang dan): ");
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.print("Nhap so phan tu mang a2: ");
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        System.out.print("Nhap a2(tang dan): ");
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        int[] merged = merge(a1, a2);
        System.out.print("Mang sau khi gop: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}