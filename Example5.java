package Lec6_Arrays;
import java.util.ArrayList;
public class Example5 {  
    public static ArrayList<Integer> getEvenNumbers(int[] numbers) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) { // kiểm tra số chẵn
                evenList.add(num); // thêm vào ArrayList
            }
        }
        return evenList;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayList<Integer> result = getEvenNumbers(array);
        System.out.println("ArrayList containing even numbers: " + result);
    }
}
