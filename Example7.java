package Lec6_Arrays;
import java.util.ArrayList;
public class Example7 {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) { //khai báo nhận thức vào biến inte và trả lại không trùng
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).equals(current)) {
                    list.remove(j); // xóa phần tử trùng
                    j--; // lùi lại vì list giảm kích thước
                }
            }
        }
        return list; // chính list ban đầu nhưng đã loại trùng
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);
        System.out.println("Original list: " + numbers);
        ArrayList<Integer> noDuplicates = removeDuplicates(numbers);
        System.out.println("List without duplicates: " + noDuplicates);
    }
}

