import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double w=Double.parseDouble(scan.nextLine());
        double h=Double.parseDouble(scan.nextLine());

        double h1=h*100-100;
        double h2=(int)h1/70;

        double w1=w*100;
        double w2=(int)w1/120;

        double seats=w2*h2-3;
        System.out.println((int)seats);
    }
}
