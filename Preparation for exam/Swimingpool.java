import java.util.Scanner;
import java.text.DecimalFormat;

public class Swimingpool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.####");

        int n=Integer.parseInt(scan.nextLine());
        int p1=Integer.parseInt(scan.nextLine());
        int p2=Integer.parseInt(scan.nextLine());
        double h=Double.parseDouble(scan.nextLine());

        double truba1=p1*h;
        double truba2=p2*h;
        double totalTrubi=truba1+truba2;
        if(totalTrubi<=n){
            System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%.",Math.floor((totalTrubi/n)*100),
                    Math.floor((truba1/totalTrubi)*100),Math.floor((truba2/totalTrubi)*100));
        }
        else{
            double total=(totalTrubi-n);
            System.out.printf("For %s hours the pool overflows with %.1f liters.",df.format(h),total);
        }
    }
}
