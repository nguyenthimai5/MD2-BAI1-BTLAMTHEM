import java.util.Scanner;

public class TINHDIENTICHVACHUVIHINHCHUNHAT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("nhập độ dài cạnh a: ");
        double a= sc.nextDouble();
        System.out.print("nhập độ dài cạnh b: ");
        double b=sc.nextDouble();
        double area=a*b;
        double chuVi=(a+b)*2;
        if (a>0&&b>0){
            System.out.printf("S hình cn là:%f",area);
            System.out.printf("C hình chữ nhật là:%f",chuVi);
        }else {
            System.out.print("dữ liệu a hoặc b không đúng!Vui lòng nhập lại");
        }
    }
}
