import java.util.Scanner;

public class Results {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a=Double.parseDouble(scan.nextLine());
        if(a>=5.50) {
            System.out.println("Excellent!");
        }
        else{
            System.out.println("Not excellent.");
        }


    }
}
