import java.util.Scanner;

public class BonysScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bonusPoints = 0;

        double points = Double.valueOf(scan.nextLine());

        if (points <= 100) {
            bonusPoints += 5;
        } else if (points > 100 && points <= 1000) {
            bonusPoints += ( points * 0.2);
        } else if (points > 1000) {
            bonusPoints += (points * 0.1);
        }

        if(points % 2 ==0){
            bonusPoints++;
        }
        if(points % 10 == 5){
            bonusPoints +=2;
        }
        System.out.println(bonusPoints);
        System.out.println((points+bonusPoints));
    }

}