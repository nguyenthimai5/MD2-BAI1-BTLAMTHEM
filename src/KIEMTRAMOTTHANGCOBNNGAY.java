import java.util.Scanner;

public class KIEMTRAMOTTHANGCOBNNGAY {
    public static void main(String[] args) {
        System.out.println("--------TÍNH SỐ NGÀY CỦA MỘT THÁNG--------");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số năm sinh :");
        int y=scanner.nextInt();
        System.out.println("Nhập số năm tháng :");
        int m=scanner.nextInt();
           if (m==1||m==3||m==5||m==7||m==9||m==11){
               System.out.printf(" Tháng:%d của năm:%d có 31 ngày ",m,y);
           } else if (m==4||m==6||m==8||m==10||m==12) {
               System.out.printf(" Tháng:%d của năm:%d có 30 ngày ",m,y);
           }else if (y%4==0&&y%100!=0){
               if (m==2){
               System.out.printf(" Tháng:%d của năm:%d có 29 ngày ",m,y);
           }}else if (m==2){
                   System.out.printf(" Tháng:%d của năm:%d có 28 ngày ",m,y);
               }

        }

    }

