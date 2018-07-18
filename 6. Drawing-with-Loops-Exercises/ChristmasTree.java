import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());

        for(int row=0; row<=n;row++){
            String spaces=repeatStr(" ",n-row);
            String asterisk=repeatStr("*",row);
            System.out.print(spaces);
            System.out.print(asterisk);
            System.out.print(" | ");
            System.out.print(asterisk);
            System.out.println();
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
