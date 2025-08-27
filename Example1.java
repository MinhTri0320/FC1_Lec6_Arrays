package Lec6_Arrays;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap day cac so nguyen: ");
        int n=sc.nextInt();
        int t[]= new int[n];
        System.out.print("Nhap " + n + " so nguyen: ");
        for(int i=0; i<n ;i++){
            t[i]=sc.nextInt();
        }
        int max=t[0];
        int min=t[0];
        for(int i=0; i<n; i++){
            if(t[i]>max){
                max=t[i];
            }
            if(t[i]<min){
                min=t[i];
            }
        }
        System.out.println("Gia tri lon nhat: " + max);
        System.out.println("Gia tri nho nhat: " + min);
    }
}
