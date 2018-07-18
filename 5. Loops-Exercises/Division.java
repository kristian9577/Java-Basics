import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());

        double p2=0;
        double p3=0;
        double p4=0;

        for(int i =0; i<n;i++){
            double s=Double.parseDouble(scan.nextLine());
            if(s%2==0){
                p2++;
            }
            if(s%3==0){
                p3++;
            }
            if(s%4==0){
                p4++;
            }
        }
        System.out.printf("%.2f%%\n",(p2/n)*100);
        System.out.printf("%.2f%%\n",(p3/n)*100);
        System.out.printf("%.2f%%\n",(p4/n)*100);
    }
}
