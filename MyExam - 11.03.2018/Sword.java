import java.util.Scanner;

public class Sword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sharp = n - 1;
        int space = 3;
        int widht = 2 * n + 1;
        int g = 0;
        int p = 0;

        for (int i = 0; i <= n / 2; i++) {
            if (i == 0) {
                System.out.println(repeatStr("#", sharp) + "/^\\" + repeatStr("#", sharp));
            } else {
                System.out.println(repeatStr("#", sharp) + "." + repeatStr(" ", space)
                        + "." + repeatStr("#", sharp));
                space += 2;
            }
            sharp--;
        }
        if (n % 2 == 0) {

            int o=2;
            for (int i = 4; i <=n ; i+=2) {
                if(i==4){
                    p=1;
                }
                else{
                    p=o;
                    o+=2;

                }

            }
            System.out.println(repeatStr("#", n / 2 - 1) + "|" + repeatStr(" ", n / 2) +
                    "S" + repeatStr(" ", n / 2) + "|" + repeatStr("#", n / 2 - 1));
            System.out.println(repeatStr("#", n / 2 - 1) + "|" + repeatStr(" ", n / 2) +
                    "O" + repeatStr(" ", n / 2) + "|" + repeatStr("#", n / 2 - 1));
            System.out.println(repeatStr("#", n / 2 - 1) + "|" + repeatStr(" ", n / 2) +
                    "F" + repeatStr(" ", n / 2) + "|" + repeatStr("#", n / 2 - 1));
            System.out.println(repeatStr("#", n / 2 - 1) + "|" + repeatStr(" ", n / 2) +
                    "T" + repeatStr(" ", n / 2) + "|" + repeatStr("#", n / 2 - 1));

            for (int i = 0; i < p; i++) {
                System.out.println(repeatStr("#", n / 2 - 1) + "|" + repeatStr(" ", n + 1)
                        + "|" + repeatStr("#", n / 2 - 1));

            }
            System.out.println(repeatStr("#", n / 2 - 1) + "|" + repeatStr(" ", n / 2) +
                    "U" + repeatStr(" ", n / 2) + "|" + repeatStr("#", n / 2 - 1));
            System.out.println(repeatStr("#", n / 2 - 1) + "|" + repeatStr(" ", n / 2) +
                    "N" + repeatStr(" ", n / 2) + "|" + repeatStr("#", n / 2 - 1));
            System.out.println(repeatStr("#", n / 2 - 1) + "|" + repeatStr(" ", n / 2) +
                    "I" + repeatStr(" ", n / 2) + "|" + repeatStr("#", n / 2 - 1));
        } else {//nechetni

            System.out.println(repeatStr("#", n / 2) + "|" + repeatStr(" ", n / 2) +
                    "S" + repeatStr(" ", n / 2) + "|" + repeatStr("#", n / 2));
            System.out.println(repeatStr("#", n / 2) + "|" + repeatStr(" ", n / 2) +
                    "O" + repeatStr(" ", n / 2) + "|" + repeatStr("#", n / 2));
            System.out.println(repeatStr("#", n / 2) + "|" + repeatStr(" ", n / 2) +
                    "F" + repeatStr(" ", n / 2) + "|" + repeatStr("#", n / 2));
            System.out.println(repeatStr("#", n / 2) + "|" + repeatStr(" ", n / 2) +
                    "T" + repeatStr(" ", n / 2) + "|" + repeatStr("#", n / 2));

            for (int i = 0; i < (2*n-7)/2 ; i++) {
                System.out.println(repeatStr("#", n / 2) + "|" + repeatStr(" ", n)
                        + "|" + repeatStr("#", n / 2));

            }
            System.out.println(repeatStr("#", n / 2) + "|" + repeatStr(" ", n / 2) +
                    "U" + repeatStr(" ", n / 2) + "|" + repeatStr("#", n / 2));
            System.out.println(repeatStr("#", n / 2) + "|" + repeatStr(" ", n / 2) +
                    "N" + repeatStr(" ", n / 2) + "|" + repeatStr("#", n / 2));
            System.out.println(repeatStr("#", n / 2) + "|" + repeatStr(" ", n / 2) +
                    "I" + repeatStr(" ", n / 2) + "|" + repeatStr("#", n / 2));

        }
        System.out.println("@" + repeatStr("=", widht - 2) + "@");

        if (n % 2 == 0) {
            g = n - 1;
        } else {
            g = n - 2;
        }

            for (int i = 0; i < n / 2; i++) {
                System.out.println(repeatStr("#", ((2*n)+1-g)/2) + "|" +
                        repeatStr(" ", g-2)
                        + "|" + repeatStr("#", ((2*n)+1-g)/2));
                if (i == (n / 2 - 1)) {
                    System.out.println(repeatStr("#", ((2*n)+1-g)/2) + "\\" +
                            repeatStr(".", g-2) + "/" +
                            repeatStr("#", ((2*n)+1-g)/2));
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
