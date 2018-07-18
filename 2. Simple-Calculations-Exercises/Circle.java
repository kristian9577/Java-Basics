import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r =Double.valueOf(scan.nextLine());
        double area = Math.PI*r*r;
        double perimeter = 2*Math.PI*r;
        System.out.println("Area = "+area);
        System.out.println("Perimeter = "+perimeter);
    }
}
