import java.util.Scanner;

public class AreaFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fig=scan.nextLine();

        if(fig.equals("square")){
            double a=Double.valueOf(scan.nextLine());
            double area=a*a;
            System.out.printf("%.3f",area);
        }
        else if(fig.equals("rectangle")){
            double a=Double.valueOf(scan.nextLine());
            double b=Double.valueOf(scan.nextLine());
            double area=a*b;
            System.out.printf("%.3f",area);
        }
        else if(fig.equals("circle")){
            double a=Double.valueOf(scan.nextLine());
            double area=a*a*Math.PI;
            System.out.printf("%.3f",area);
        }
        else if(fig.equals("triangle")){
            double a=Double.valueOf(scan.nextLine());
            double h=Double.valueOf(scan.nextLine());
            double area=(a*h)/2;
            System.out.printf("%.3f",area);
        }

    }
}
