import java.util.Scanner;

public class Lutenitsa {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        double kgTomato = Double.parseDouble(scanner.nextLine());
        int casets = Integer.parseInt(scanner.nextLine());
        int jars = Integer.parseInt(scanner.nextLine());

        double kgLutenitsa = kgTomato / 5;
        System.out.print("Total lutenica: ");
        System.out.print((int) kgLutenitsa);
        System.out.println(" kilograms.");

        double kgJars = kgLutenitsa / 0.535;
        double kgCasets = kgJars / jars;

        if (kgCasets >= casets) {
            double leftBoxes = kgCasets - casets;
            double leftJars = kgJars - (casets * jars);
            System.out.printf("%d boxes left.%n", (int) (Math.floor(leftBoxes)));
            System.out.printf("%d jars left.", (int) (Math.abs((Math.floor(leftJars)))));
        } else {
            System.out.printf("%d more boxes needed.%n", (int) (Math.floor((casets - kgCasets))));
            System.out.printf("%d more jars needed.", (int) (Math.floor((casets * jars) - kgJars)));
        }
    }

}