import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x=Integer.parseInt(scan.nextLine());
        double y=Double.parseDouble(scan.nextLine());
        int z=Integer.parseInt(scan.nextLine());
        int people=Integer.parseInt(scan.nextLine());

        double area=x*y;
        double wine=0.4*area/2.5;
        if(wine>=z){
            double liters=wine-z;
            double person=liters/people;
            System.out.printf("Good harvest this year! Total wine: %d liters.\n",(int)Math.floor(wine));
            System.out.printf("%d liters left -> %d liters per person.",(int)Math.ceil(liters),(int)Math.ceil(person));
        }
        else
        {
            double liters=z-wine;
            System.out.printf("It will be a tough winter! More %d liters wine needed.",(int)Math.floor(liters));
        }
    }
}
