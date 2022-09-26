import java.util.Scanner;

public class BTtinhSvaChinhvuong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập độ dài cạnh a: ");
    double a=sc.nextDouble();
    double area=a*a;
    double perimeter=4*a;
    if (a>0){
        System.out.printf("Diện tích của hình vuông là:%f",area);
        System.out.printf("Chu vi hình vuông là:%f",perimeter);
    }else {
        System.out.println("Cạnh a không phù hợp ! vui lòng nhập lại");
    }
    }
}
