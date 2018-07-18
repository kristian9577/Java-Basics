import java.util.Scanner;

public class rectangleArea2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1=Double.valueOf(scan.nextLine());
        double y1=Double.valueOf(scan.nextLine());
        double x2=Double.valueOf(scan.nextLine());
        double y2=Double.valueOf(scan.nextLine());
        double a =x1-x2;
        if(a<0){
            a=-a;
        }
            double b=y2-y1;
        if(b<0){
            b=-b;
        }
       // System.out.println(Math.abs(x1-x2)*Math.abs(y1-y2));
       // System.out.println(2*(Math.abs(x1-x2)+ Math.abs(y1-y2)));

        double area =a*b;
        double perimeter =2*(a+b);
        System.out.println(area);
        System.out.println(perimeter);

    }
}
