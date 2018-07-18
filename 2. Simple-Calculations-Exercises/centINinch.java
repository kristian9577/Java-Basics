import java.util.Scanner;

public class centINinch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         double inch =Double.parseDouble(scan.nextLine());
         double cent = inch * 2.54;
        System.out.println(cent);
    }
}
