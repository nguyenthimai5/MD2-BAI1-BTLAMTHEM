import java.util.Scanner;

public class KTRAMOTTAMGIAC {
    public static void main(String[] args) {
        System.out.print("-------KIỂM TRA XEM ĐÓ LÀ TAM GIÁC GÌ?-------\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh a:");
        double a = sc.nextDouble();
        System.out.println("Nhập cạnh b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập cạnh c: ");
        double c = sc.nextDouble();
        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == b * b + a * a) {
                if (a == b || a == c || b == c) {
                    System.out.printf("Ba cạnh a:%f b:%f c:%f là tam giác vuông cân ", a, b, c);
                } else {
                    System.out.printf("Ba cạnh a:%f b:%f c:%f là tam giác vuông", a, b, c);
                }
            }
            else if (a == b && a == c ) {
                System.out.printf("Ba cạnh a:%f b:%f c:%f là tam giác đều", a, b, c);
            }
            else if (a == b || a == c || b == c) {
                System.out.printf("Ba cạnh a:%f b:%f c:%f là tam giác cân", a, b, c);
            }
            else {
                System.out.printf("Ba cạnh a:%f b:%f c:%f là tam giác thường", a, b, c);
            }
        }else {
            System.out.printf("Ba cạnh a:%f b:%f c:%f  không phải là một tam giác", a, b, c);
        }
    }
}
