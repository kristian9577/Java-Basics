import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n-2; i++) {
            if (i % 2 == 0) {
                System.out.println(repeatStr("*", n - 2) + "\\" + " " + "/" + repeatStr("*", n - 2));
            } else {
                System.out.println(repeatStr("-", n - 2) + "\\" + " " + "/" + repeatStr("-", n - 2));
            }
        }
        System.out.println(repeatStr(" ",n-1)+"@"+repeatStr(" ",n-1));
        for (int i = 0; i < n-2; i++) {
            if (i % 2 == 0) {
                System.out.println(repeatStr("*", n - 2) + "/" + " " + "\\" + repeatStr("*", n - 2));
            } else {
                System.out.println(repeatStr("-", n - 2) + "/" + " " + "\\" + repeatStr("-", n - 2));
            }
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
