import java.util.Scanner;

public class NumberGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int m = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        int specialNumber = Integer.parseInt(scan.nextLine());
        int controlNumber = Integer.parseInt(scan.nextLine());

        for (int i = m; i >= 1; i--) {
            for (int j = l; j >= 1; j--) {
                for (int k = n; k >= 1; k--) {
//                    int special=specialNumber;
                    int number = i* 100 + j * 10 + k;
                    if (number % 3 == 0) {
                        specialNumber += 5;
                    } else if (number % 10 == 5) {
                        specialNumber -= 2;
                    } else if (number % 2 == 0) {
                        specialNumber *= 2;
                    }
                    if (specialNumber >= controlNumber) {
                        System.out.printf("Yes! Control number was reached! Current special number is %d.", specialNumber);
                       return;
                    }
                }

            }
        }
        if (specialNumber < controlNumber) {
            System.out.printf("No! %d is the last reached special number.", specialNumber);
        }
    }
}
