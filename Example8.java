package Lec6_Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap day so nguyen: ");
        int[] arr=new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array: " +Arrays.toString(arr));
        System.out.print("Number to find: ");
        int k=sc.nextInt();
        int index = Arrays.binarySearch(arr,k);
        if(index>=0){
            System.out.println("The number " +k+ " was found at index " +index);
        }else{
            System.out.println("The number " +k+ " was not found");
        }
        sc.close();
    }
}
