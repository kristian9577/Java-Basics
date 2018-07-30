import java.text.DecimalFormat;
import java.util.Scanner;

public class SlepyTom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.####");
        int n=Integer.parseInt(scan.nextLine());

        int freeTime=n*127;
        int busyTime=(365-n)*63;
        int allTime=freeTime+busyTime;
        if(30000>=allTime){
            int day=((30000-allTime)/60);
            int hours=((30000-allTime)%60);
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",day,hours);
        }
        else{
            int day=((allTime-30000)/60);
            int hours=((allTime-30000)%60);
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",day,hours);
        }
    }
}
