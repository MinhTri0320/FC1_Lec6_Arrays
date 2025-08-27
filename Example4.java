package Lec6_Arrays;
import java.util.ArrayList; //dùng để lưu danh sách công việc
import java.util.Scanner;  //dùng để nhập dữ liệu từ bàn phím
public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>(); //là một ArrayList<String> để lưu các công việc (String).
        int c; //biến để lưu lựa chọn menu của người dùng.
        do {
            System.out.println("\n===== To-Do List Menu =====");
            System.out.println("1. Add a new task");
            System.out.println("2. View all tasks");
            System.out.println("3. Remove a task by index");
            System.out.println("4. Exit");  
            System.out.print("Enter your choice: ");
            c = scanner.nextInt(); //đọc lựa chọn số
            scanner.nextLine();
            switch (c) {
                case 1:
                    System.out.print("Enter a new task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);  //thêm vào danh sach
                    System.out.println("Task added!");
                    break;
                case 2:
                    System.out.println("\nYour To-Do List:");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet!");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter the index of the task to remove: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < tasks.size()) {
                        System.out.println("Removed: " + tasks.remove(index));
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (c != 4);
    }
}
