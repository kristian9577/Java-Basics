import java.util.Scanner;

public class ShivashkiCex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m=Integer.parseInt(scan.nextLine());
        double d=Double.valueOf(scan.nextLine());
        double s=Double.valueOf(scan.nextLine());

        double d1=d+2*0.3;
        double d2=d/2;
        double s1=s+2*0.3;
        double area1=m*d1*s1;
        double area2=m*d2*d2;

        double dollars=area1*7+area2*9;
        double leva=dollars*1.85;

        System.out.printf("%.2f USD\n",dollars);
        System.out.printf("%.2f BGN\n",leva);
    }
}
