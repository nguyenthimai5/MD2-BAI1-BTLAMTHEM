import java.util.Scanner;

public class docso {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số muốn đọc từ 0-9");
    int x=scanner.nextInt();
    if (x>=0&&x<10){
        switch (x){
            case 0:
                System.out.println("Đọc là: không");
                break;
            case 1:
                System.out.println("Đọc là: một");
                break;
            case 2:
                System.out.println("Đọc là: hai");
                break;
            case 3:
                System.out.println("Đọc là: ba");
                break;
            case 4:
                System.out.println("Đọc là: bốn");
                break;
            case 5:
                System.out.println("Đọc là: năm");
                break;
            case 6:
                System.out.println("Đọc là: sáu");
                break;
            case 7:
                System.out.println("Đọc là: bảy");
                break;
            case 8:
                System.out.println("Đọc là: tám");
                break;
            default:
                System.out.println("Đọc là:chín ");

        }
    }else {
        System.out.println("Vui lòng nhập giá trị trong khoảng 0-9!");
    }
    }
}
