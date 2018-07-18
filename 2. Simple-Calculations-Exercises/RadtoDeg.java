import java.util.Scanner;

public class RadtoDeg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double rad =Double.valueOf(scan.nextLine());
        double deg=Math.round((rad*180)/Math.PI);
        System.out.println(deg);
    }
}
