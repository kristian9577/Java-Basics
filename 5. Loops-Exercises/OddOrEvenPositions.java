import java.util.Scanner;

public class OddOrEvenPositions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = Integer.parseInt(scan.nextLine());
        double oddSum = 0;
        double oddMin = Double.NEGATIVE_INFINITY;
        double oddMax = Double.NEGATIVE_INFINITY;
        double evenSum = 0;
        double evenMin = Double.NEGATIVE_INFINITY;
        double evenMax = Double.NEGATIVE_INFINITY;

        if (n == 1) {
            double a = Double.parseDouble(scan.nextLine());
            System.out.printf("OddSum=%.0f, ", a);
            System.out.printf("OddMin=%.0f, ",a);
            System.out.printf("OddMax=%.0f,",a);

            System.out.print("EvenSum=0, " );
            System.out.print("EvenMin=No, ");
            System.out.print("EvenMax=No, ");
        } else if (n == 0) {
            System.out.print("OddSum=0, ");
            System.out.print("OddMin=No, ");
            System.out.print("OddMax=No, ");

            System.out.print("EvenSum=0, ");
            System.out.print("EvenMin=No, ");
            System.out.print("EvenMax=No");
        } else {
            for (int i = 1; i <= n; i++) {
                double a = Double.parseDouble(scan.nextLine());
                if (i % 2 == 0) {
                    evenSum += a;
                    if (a > evenMax) {
                        evenMax = a;
                    }
                    if (a < evenMin) {
                        evenMin = a;
                    }
                } else {
                    oddSum += a;
                    if (a > oddMax) {
                        oddMax = a;
                    }
                    if (a < oddMin) {
                        oddMin = a;
                    }
                }
            }
            System.out.printf("OddSum=%.1f, ",oddSum);
            System.out.printf("OddMin=%.1f, ",oddMin);
            System.out.printf("OddMax=%.1f, ", oddMax);
            System.out.printf("EvenSum=%.1f, ",evenSum);
            System.out.printf("EvenMin=%.1f, ", evenMin);
            System.out.printf("EvenMax=%.1f",evenMax);
        }
    }
}
