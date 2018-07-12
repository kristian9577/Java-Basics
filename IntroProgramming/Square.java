package IntroProgramming;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();

        for (int i = 0; i < size; i++) { //first line
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < size-2; i++) {
            System.out.print('*');
            for (int j = 0; j < size-2; j++) {  /// mid line
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < size; i++) { // last line
            System.out.print("*");
        }
        System.out.println();

    }
}
