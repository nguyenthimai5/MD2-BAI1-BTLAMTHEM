import java.util.Scanner;

public class tinhtiendientieuthucuamothogd {
    public static void main(String[] args) {
        System.out.println("chương trình tính giá tiền tiêu thụ điện của hộ gia đình");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số điện tiêu thụ cũ");
        int dienCu=scanner.nextInt();
        System.out.println("Nhập số điện tiêu thụ moi");
        int thueBaoHangThang=10000;
        int dienMoi=scanner.nextInt();
        int soDienTieuThu=dienMoi-dienCu;
        if (soDienTieuThu>0){
            if (soDienTieuThu<50){
                int tienDienThang1=soDienTieuThu*700+thueBaoHangThang;
                System.out.printf("tiền điện một tháng là:%dđ",tienDienThang1);
            } else if(soDienTieuThu>=50&&soDienTieuThu<100) {
                int tienDienThang2=soDienTieuThu*700+(soDienTieuThu-50)*900+thueBaoHangThang;
                System.out.printf("tiền điện một tháng là:%dđ",tienDienThang2);
            } else if (soDienTieuThu >= 100 && soDienTieuThu < 150) {
                int tienDienThang3=soDienTieuThu*700+(soDienTieuThu-50)*900+(soDienTieuThu-50)*1100+thueBaoHangThang;
                System.out.printf("tiền điện một tháng là:%dđ",tienDienThang3);

            }else {
                int tienDienThang4=soDienTieuThu*700+(soDienTieuThu-50)*900+(soDienTieuThu-50)*1100+(soDienTieuThu-50)*1300+thueBaoHangThang;
                System.out.printf("tiền điện một tháng là:%dđ",tienDienThang4);

            }
        }else {
            System.out.println("Vui lòng nhập lại dữ liệu!");

        }
        }

}
