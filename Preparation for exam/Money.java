import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());
        double u=Double.parseDouble(scan.nextLine());
        double k=Double.parseDouble(scan.nextLine());

        int n1=n*1168;
        double u1=(u*0.15)*1.76;
        double money=(n1+u1)/1.95;
        double k1=(k/100)*money;
        double price=money-k1;
        System.out.printf("%.2f",price);
    }
}
