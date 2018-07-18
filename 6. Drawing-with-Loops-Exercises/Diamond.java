import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String firstAndLastRow = "";
        String body = "";

        String middleRow = "*" + repeatStr("-", n - 2) + "*";

        if (n != 1 && n != 2) {
            if (n % 2 == 0) {//четно
                firstAndLastRow = repeatStr("-", (n - 2) / 2)
                        + "**"
                        + repeatStr("-", (n - 2) / 2);
                System.out.println(firstAndLastRow);
                for (int i = 0; i < (n - 4) / 2; i++) {

                    body = repeatStr("-", (n - 4) / 2 - i)
                            + "*"
                            + repeatStr("-", 2 + i + i)
                            + "*"
                            + repeatStr("-", (n - 4) / 2 - i);
                    System.out.println(body);
                }
                System.out.println(middleRow);

                for (int i = 0; i < (n - 4) / 2; i++) {
                    body = repeatStr("-", 1 + i) + "*" +
                            repeatStr("-", n - 4 - i - i) + "*" +
                            repeatStr("-", 1 + i);
                    System.out.println(body);

                }
                System.out.println(firstAndLastRow);

            } else {//нечетно

                firstAndLastRow = repeatStr("-", (n - 1) / 2)
                        + "*"
                        + repeatStr("-", (n - 1) / 2);
                System.out.println(firstAndLastRow);
                for (int i = 0; i < (n - 3) / 2; i++) {

                    body = repeatStr("-", (n - 3) / 2 - i)
                            + "*" + repeatStr("-", 1 + i + i) + "*"
                            + repeatStr("-", (n - 3) / 2 - i);
                    System.out.println(body);

                }
                System.out.println(middleRow);

                for (int i = 0; i < (n - 3) / 2; i++) {
                    body = repeatStr("-", 1 + i) + "*" +
                            repeatStr("-", n - 4 - i - i) + "*" +
                            repeatStr("-", 1 + i);
                    System.out.println(body);
                }
                System.out.println(firstAndLastRow);

            }
        } else if (n == 1) {
            System.out.println("*");
        } else if (n == 2) {
            System.out.println("**");
        }
    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
