package Lec6_Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua danh sach: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Nhap cac phan tu: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        for (int i = list.size() - 1; i >= 0; i--) { // Xóa phần tử > 50 bằng cách duyệt ngược
            if (list.get(i) > 50) {
                list.remove(i); // xóa phần tử tại vị trí i
            }
        }
        System.out.println("Danh sach sau khi xoa: " + list);
        sc.close();
    }
}