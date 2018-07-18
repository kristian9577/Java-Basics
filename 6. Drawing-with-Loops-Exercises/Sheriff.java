import java.util.Scanner;

public class Sheriff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int t = (3 * n) / 4 - 1;
        int t1 = 1;

        System.out.println(repeatStr(".", (3 * n) / 2) + repeatStr("x", 1) +
                repeatStr(".", (3 * n) / 2));
        System.out.println(repeatStr(".", (3 * n) / 2 - 1) + repeatStr("/x\\", 1) +
                repeatStr(".", (3 * n) / 2 - 1));
        System.out.println(repeatStr(".", (3 * n) / 2 - 1) + repeatStr("x|x", 1) +
                repeatStr(".", (3 * n) / 2 - 1));
        for (int i = 0; i < (n - 1) / 2; i++) {
            String cycle = repeatStr(".", (n * 3 - 1) / 2 - n - i) + repeatStr("x", n + i)
                    + "|"
                    + repeatStr("x", n + i)
                    + repeatStr(".", (n * 3 - 1) / 2 - n - i);
            System.out.println(cycle);
        }
        String middle = repeatStr("x", (n*3-1)/2) + "|" + repeatStr("x", (n*3-1)/2);
        System.out.println(middle);

        for (int i = 0; i < (n - 1) / 2 ; i++) {
            String cycleReverse = repeatStr(".", 1 + i) + repeatStr("x", (n*3 - 3)/2 - i)
                    + "|"
                    + repeatStr("x", (n*3 - 3)/2 - i)
                    + repeatStr(".", 1 + i);
            System.out.println(cycleReverse);
        }
        System.out.println(repeatStr(".", (3 * n) / 2 - 1) + repeatStr("/x\\", 1) +
                repeatStr(".", (3 * n) / 2 - 1));
        System.out.println(repeatStr(".", (3 * n) / 2 - 1) + repeatStr("\\x/", 1) +
                repeatStr(".", (3 * n) / 2 - 1));
        for (int i = 0; i < (n - 1) / 2; i++) {
            String cycle = repeatStr(".", (n * 3 - 1) / 2 - n - i) + repeatStr("x", n + i)
                    + "|"
                    + repeatStr("x", n + i)
                    + repeatStr(".", (n * 3 - 1) / 2 - n - i);
            System.out.println(cycle);
        }
        System.out.println(middle);

        for (int i = 0; i < (n - 1) / 2 ; i++) {
            String cycleReverse = repeatStr(".", 1 + i) + repeatStr("x", (n*3 - 3)/2 - i)
                    + "|"
                    + repeatStr("x", (n*3 - 3)/2 - i)
                    + repeatStr(".", 1 + i);
            System.out.println(cycleReverse);
        }
        System.out.println(repeatStr(".", (3 * n) / 2 - 1) + repeatStr("x|x", 1) +
                repeatStr(".", (3 * n) / 2 - 1));
        System.out.println(repeatStr(".", (3 * n) / 2 - 1) + repeatStr("\\x/", 1) +
                repeatStr(".", (3 * n) / 2 - 1));
        System.out.println(repeatStr(".", (3 * n) / 2) + repeatStr("x", 1) +
                repeatStr(".", (3 * n) / 2));
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
