import java.util.Scanner;

public class Ladybirdy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());

        int width = 2 * n + 1;
        if (n != 2) {
            //start Print head
            System.out.println(repeatStr(" ", n - 2) + "@   @");
            System.out.println(repeatStr(" ", n - 1) + "\\_/");
            System.out.println(repeatStr(" ", n - 1) + "/ \\");
            System.out.println(repeatStr(" ", n - 1) + "|_|");
            // stop print head

            for (int i = 0; i < n; i++) {
                String upPartOfBody = repeatStr(" ", n - 1 - i)
                        + "/" + repeatStr(" ", i) + "|" + repeatStr(" ", i) + "\\";
                System.out.println(upPartOfBody);
            }

            if (n % 2 == 0) {//четни
                for (int i = 0; i < n / 2; i++) {
                    String middle = "|" + repeatStr(" ", n / 2 - 1) + "@"
                            + repeatStr(" ", n / 2 - 1) + "|"
                            + repeatStr(" ", n / 2 - 1) + "@"
                            + repeatStr(" ", n / 2 - 1) + "|";
                    System.out.println(middle);
                }
            } else {
                for (int i = 0; i < n / 2; i++) {
                    String middle = "|" + repeatStr(" ", n / 2 - 1) + "@"
                            + repeatStr(" ", n / 2) + "|"
                            + repeatStr(" ", n / 2) + "@"
                            + repeatStr(" ", n / 2 - 1) + "|";
                    System.out.println(middle);
                }
            }
            for (int i = 0; i < n / 2; i++) {
                String downPartOfBody = repeatStr(" ", i) + "\\"
                        + repeatStr(" ", n - 1 - i) + "|"
                        + repeatStr(" ", n - 1 - i) + "/";
                System.out.println(downPartOfBody);

            }
            String lastRow = repeatStr(" ", n - (n / 2))
                    + repeatStr("^", n / 2) + "|"
                    + repeatStr("^", n / 2)
                    + repeatStr(" ", n - (n / 2));
            System.out.println(lastRow);
        } else {
            //start Print head
            System.out.println(repeatStr(" ", n - 2) + "@   @");
            System.out.println(repeatStr(" ", n - 1) + "\\_/");
            System.out.println(repeatStr(" ", n - 1) + "/ \\");
            System.out.println(repeatStr(" ", n - 1) + "|_|");
            // stop print head
            for (int i = 0; i < n; i++) {
                String upPartOfBody = repeatStr(" ", n - 1 - i)
                        + "/" + repeatStr(" ", i) + "|" + repeatStr(" ", i) + "\\";
                System.out.println(upPartOfBody);
            }
            for (int i = 0; i < n / 2; i++) {
                String middle = "|" + repeatStr(" ", n / 2 - 1) + "@"
                        + repeatStr(" ", n / 2 - 1) + "|"
                        + repeatStr(" ", n / 2 - 1) + "@"
                        + repeatStr(" ", n / 2 - 1) + "|";
                System.out.println(middle);
            }
            String lastRow = repeatStr(" ", n - (n / 2))
                    + repeatStr("^", n / 2) + "|"
                    + repeatStr("^", n / 2)
                    + repeatStr(" ", n - (n / 2));
            System.out.println(lastRow);

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
