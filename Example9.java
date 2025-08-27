package Lec6_Arrays;
import java.util.Arrays;
public class Example9 {
    public static void swap(int arr[], int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public static void main(String[] args) {
        int[] array={10, 20, 30};
        System.out.println("Original array: " + Arrays.toString(array));
        swap(array,0,2);
        System.out.println("Array after the function call: " + Arrays.toString(array));
    }
}
