import java.util.Scanner;

public class Rhombus {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for(int i = 1; i <= n; i++) {
            System.out.println(repeater(" ",n-i) + repeater("* ", n-(n-i)));
        }
        for(int i = 1; i < n ; i++) {
            System.out.println(repeater(" ", n-(n-i)) + repeater("* ", n-i));
        }
    }
    static String repeater(String symbol, int times) {
        StringBuilder rep = new StringBuilder();
        for(int i = 0; i < times; i++) {
            rep.append(symbol);
        }
        return rep.toString();
    }
}
