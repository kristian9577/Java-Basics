import java.util.Scanner;

public class Snowflake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());

        String star="*";
        String dot=".";

        for (int row = 0; row <n ; row++) {
            String outerDots=repeatStr(dot,row);
            String innerDots=repeatStr(dot,n-row);
            if(row==n-1){
                innerDots=star;
            }
            System.out.println(outerDots+star+innerDots+star+innerDots+star+outerDots);
        }

        String middleStas=repeatStr(star,2*n+3);
        System.out.println(middleStas);

        for (int row = 1; row <= n ; row++) {
            String outerDots=repeatStr(dot,n- row);
            String innerDots=repeatStr(dot,row);
            if(row==1){
                innerDots=star;
            }
            System.out.println(outerDots+star+innerDots+star+innerDots+star+outerDots);
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
