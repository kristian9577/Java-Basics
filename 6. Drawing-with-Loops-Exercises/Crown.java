import java.util.Scanner;

public class Crown {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int counterStarsMiddle = 0;

        System.out.println("@"+repeatStr(" ",n-2)+"@"+repeatStr(" ",n-2)+"@");
        System.out.println("**"+repeatStr(" ",n-3)+"*"+
                repeatStr(" ",n-3)+"**");

        for (int i = 1; i <= n / 2 - 2; i++) {
                      String middle = "*" + repeatStr(".", i) + "*"
                               + repeatStr(" ", n - 3 - i - i)
                               + "*" + repeatStr(".", i + counterStarsMiddle) + "*"
                              + repeatStr(" ", n - 3 - i - i)
                                + "*" + repeatStr(".", i) + "*";
                        counterStarsMiddle += 1;
                        System.out.println(middle);
                    }
              String firstLineAfterCrown = "*" + repeatStr(".", n / 2 - 1) + "*"
        	                + repeatStr(".", n - 3) + "*"
                        + repeatStr(".", n / 2 - 1) + "*";

                System.out.println(firstLineAfterCrown);

        	        String secondLineAfterCrown = "*" + repeatStr(".", n / 2)
                        + repeatStr("*", n / 2 - 2) + "."
        	                + repeatStr("*", n / 2 - 2)
                       + repeatStr(".", n / 2) + "*";

        	        System.out.println(secondLineAfterCrown);
        System.out.println(repeatStr("*",2*n-1));
        System.out.println(repeatStr("*",2*n-1));

    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
