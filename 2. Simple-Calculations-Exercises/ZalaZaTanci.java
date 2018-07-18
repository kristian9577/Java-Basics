import java.util.Scanner;

public class ZalaZaTanci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double l=Double.valueOf(scan.nextLine());
        double w=Double.valueOf(scan.nextLine());
        double a=Double.valueOf(scan.nextLine());

        double area1=(l*100)*(w*100);
        double a1=a*100;
        double area2=a1*a1;
        double area3=area1/10;
        double freearea=area1-area2-area3;
        double person=Math.floor(freearea/(7040));
        System.out.printf("%.0f",person);
    }
}
