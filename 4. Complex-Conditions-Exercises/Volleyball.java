import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String years=scan.nextLine();
        int p=Integer.parseInt(scan.nextLine());
        int h=Integer.parseInt(scan.nextLine());

         int maxWeekends=48;
         double sofiaWeekends=maxWeekends-h;
         double sofiaWekendsGame=sofiaWeekends*(3.0/4.0);
         double sofiaHolidayGame=p*(2.0/3.0);
         double games=sofiaWekendsGame+sofiaHolidayGame+h;
         double leapBonysGame=games*0.15;

         if(years.equals("leap")){
             System.out.printf("%.0f",Math.floor(games+leapBonysGame));
         }
         else if(years.equals("normal")){
             System.out.printf("%.0f",Math.floor(games));
         }
    }
}
