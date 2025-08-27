package Lec6_Arrays;
import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot chuoi(chua chu thuong): ");
        String n = sc.nextLine();
        int[] k = new int[26];
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i); // lấy ký tự tại vị trí i
            // Kiểm tra nếu c nằm trong khoảng 'a' đến 'z'
            if (c >= 'a' && c <= 'z') {
                k[c - 'a']++;
            }
        }
        System.out.println("Tan xuat xuat hien ky tu: ");
        for (int i = 0; i < 26; i++) {
            if (k[i] > 0) { // chỉ in ký tự xuất hiện ít nhất 1 lần
                char letter = (char) (i + 'a'); // chuyển index thành ký tự
                System.out.println(letter + ": " + k[i]);
            }
        }
        sc.close();
    }
}