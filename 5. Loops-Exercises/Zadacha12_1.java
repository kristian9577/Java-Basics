import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadacha12_1 {
public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        int n = Integer.parseInt(scanner.nextLine());//брой числа


    double evenSum = 0.0;
    double maxEven = -1000000000.0;
    double minEven = 1000000000.0;

    double oddSum = 0.0;
    double maxOdd = -1000000000.0;
    double minOdd = 1000000000.0;

    for (int i = 1; i <=n; i++) {
        double num = Double.parseDouble(scanner.nextLine());
        if (i%2==0) {
            evenSum = evenSum + num;
            if (num<minEven) {
                minEven = num;
            }
            if (num>maxEven) {
                maxEven = num;
            }
        } else {
            oddSum = oddSum + num;
            if (num<minOdd) {
                minOdd = num;
            }
            if (num>maxOdd) {
                maxOdd = num;
            }
        }

    }
    System.out.printf("OddSum=%s%n", df.format(oddSum));
    if (minOdd==1000000000.0) {
        System.out.println("OddMin=No");
    } else {
        System.out.printf("OddMin=%s%n", df.format(minOdd));
    }
    if (maxOdd==-1000000000.0) {
        System.out.println("OddMax=No");
    } else {
        System.out.printf("OddMax=%s%n", df.format(maxOdd));
    }
    System.out.printf("EvenSum=%s%n", df.format(evenSum));
    if (minEven==1000000000.0) {
        System.out.println("EvenMin=No");
    } else {
        System.out.printf("EvenMin=%s%n", df.format(minEven));
    }
    if (maxEven==-1000000000.0) {
        System.out.println("EvenMax=No");
    } else {
        System.out.printf("EvenMax=%s%n", df.format(maxEven));
    }
}
}