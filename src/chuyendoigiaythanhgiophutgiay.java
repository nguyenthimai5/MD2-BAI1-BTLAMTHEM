import java.util.Scanner;

public class chuyendoigiaythanhgiophutgiay {
    public static void main(String[] args) {
       System.out.println("Chuyển đổi số giây thành giờ phút giây");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số bạn muốn đổi");
        int x=scanner.nextInt();
        int gio=x/3600;
        int y=x%3600;
        int phut=y/60;
        int giay=y%60;
        System.out.printf("%d sau khi đổi sang là:%dh%dp%ds",x,gio,phut,giay);
    }
}
