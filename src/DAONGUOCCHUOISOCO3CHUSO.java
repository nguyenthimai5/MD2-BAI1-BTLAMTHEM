import java.util.Scanner;

public class DAONGUOCCHUOISOCO3CHUSO {
    public static void main(String[] args) {
        System.out.println("------ĐẢO NGƯỢC CHỮ SỐ------");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số muốn đảo ngược:");
        int x=scanner.nextInt();
        int c=x/100;
        int d=x%100;
        int e=d/10;
        int f=d%10;
        System.out.printf("đảo ngược của:%dlà %d%d%d ",x,f,e,c);

    }
}
