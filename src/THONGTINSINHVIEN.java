import java.util.Scanner;

public class THONGTINSINHVIEN {
    public static void main(String[] args) {
        System.out.printf("------STUDENT ÌNORMATION------\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã  sinh viên: ");
        String studentId = sc.nextLine();
        System.out.println("nhập tên sinh viên: ");
        String studentName = sc.nextLine();
        System.out.println("nhập tuổi sinh viên: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("nhập  giới tính: ");
        String gender = sc.nextLine();
        System.out.println("nhập email sinh viên: ");
        String email = sc.nextLine();
        System.out.println("nhập số điện thoại sinh viên: ");
        String phone = sc.nextLine();
        System.out.println("nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.printf("%15s%30s%15s%20s%7s%20d\n", "Student ID:", studentId, "Student Name:", studentName, "Age:", age);
        System.out.printf("%15s%30s%15s%20s%7s%20s\n", "Gender:", gender, "Email:", email, "Phone:", phone);
        System.out.printf("%15s%5s", "Address:", address);
    }
}
