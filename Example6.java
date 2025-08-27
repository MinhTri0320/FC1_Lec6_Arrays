package Lec6_Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                                                                  
        ArrayList<Integer> t = new ArrayList<>();
        System.out.print("Nhap cac so nguyen: ");
        int sum=0;
        while(true){
            int num=sc.nextInt();
            if(num==-1){
                break;
            }
            t.add(num);
            sum=sum+num;
        }
        System.out.println("Numbers entered: " +t);
        System.out.println("The sum is: " +sum);
    }
}
