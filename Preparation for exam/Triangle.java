import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String dot = ".";
        String charp = "#";
        String space = " ";
        int d = 1;
        int s = 1;
        int d1 = n + 1;
        int s1 = 2 * n - 1;
        System.out.println(repeatStr(charp, 4 * n + 1));
        for (int i = 0; i < n; i++) {
            if (i == n  / 2) {
                if (n % 2 == 0) {
                    System.out.println(repeatStr(dot, i+1) + repeatStr(charp, 2 * n - d) + repeatStr(space, i - 1) + "(@)" +
                            repeatStr(space, i - 1) + repeatStr(charp, 2 * n - d) + repeatStr(dot, i+1));
                } else {
                    System.out.println(repeatStr(dot, i+1) + repeatStr(charp, 2 * n - d) + repeatStr(space, i - 1) + "(@)" +
                            repeatStr(space, i - 1) + repeatStr(charp, 2 * n - d) + repeatStr(dot, i+1));
                }
            }
            else {
                System.out.println(repeatStr(dot, i+1) + repeatStr(charp, 2 * n - d) + repeatStr(space, s) +
                        repeatStr(charp, 2 * n - d) + repeatStr(dot, i+1));
            }
            d += 2;
            s += 2;

        }
        for (int i = 0; i < n; i++) {
            System.out.println(repeatStr(dot, d1) + repeatStr(charp, s1) + repeatStr(dot, d1));
            d1++;
            s1 -= 2;

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
