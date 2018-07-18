import java.util.Scanner;

public class RecordPlyvane {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double rekordSEC=Double.parseDouble(scan.nextLine());
        double distance=Double.parseDouble(scan.nextLine());
        double time=Double.parseDouble(scan.nextLine());

        double timesek=distance*time;
        double bonys=Math.floor((distance/15))*12.5;
        double alltime=timesek+bonys;

        if(rekordSEC<=alltime){
            double all=alltime-rekordSEC;
            System.out.printf("No, he failed! He was %.2f seconds slower.",all);
        }
        else{
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",alltime);
        }
    }
}
