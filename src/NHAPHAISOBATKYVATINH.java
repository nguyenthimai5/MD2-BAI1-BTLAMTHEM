import java.util.Scanner;

public class NHAPHAISOBATKYVATINH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập giá trị của a: ");
        int a = sc.nextInt();
        System.out.println("nhập giá trị của b: ");
        int b = sc.nextInt();
        int c = a * b;
        int d = a - b;
        int k = b - a;
        double e = (double) a / (double) b;
        double f = (double) b / (double) a;
        int g = a + b;
        System.out.printf("a*b=%d \n", c);
        System.out.printf("nếu a-b:%d \n ", d);
        System.out.printf("nếu b-a:%d \n", k);
        System.out.printf("nếu a/b:%f \n  ", e);
        System.out.printf("nếu b/a:%f \n", f);
        System.out.printf("a+b=:%d \n", g);

    }
}
