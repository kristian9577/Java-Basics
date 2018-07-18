import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());
        double p1=0;
        double p2=0;
        double p3=0;
        double p4=0;
        double p5 = 0;


        for(int i=0; i<n;i++) {
        double s=Double.parseDouble(scan.nextLine());
        if(s<200){
           p1++;
        }
        else if(s<=399){
            p2++;
        }
        else if(s<=599){
            p3++;
        }
        else if( s<=799){
            p4++;
        }
        else {
            p5++;
        }
        }
        System.out.printf("%.2f%%\n",(p1/n)*100);
        System.out.printf("%.2f%%\n",(p2/n)*100);
        System.out.printf("%.2f%%\n",(p3/n)*100);
        System.out.printf("%.2f%%\n",(p4/n)*100);
        System.out.printf("%.2f%%\n",(p5/n)*100);

    }
}
