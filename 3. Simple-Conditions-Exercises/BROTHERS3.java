import java.util.Scanner;

public class BROTHERS3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double s1=Double.valueOf(scan.nextLine());
        double s2=Double.valueOf(scan.nextLine());
        double s3=Double.valueOf(scan.nextLine());
        double f=Double.valueOf(scan.nextLine());

        double alltime=1/(1/s1+1/s2+1/s3);
        double cleantime=alltime+(alltime*0.15);

        double thetime=cleantime-f;
        double thetime1=f-cleantime;

        System.out.printf("Cleaning time: %.2f\n", cleantime);
        if(thetime1>0){
            System.out.printf("Yes, there is a surprise - time left -> " +(int)(Math.floor(thetime1))+" hours.");
        }
        else if(thetime1<0){
            System.out.printf("No, there isn't a surprise - shortage of time -> "+ (int)(Math.ceil(thetime))+" hours.");
        }
    }
}
