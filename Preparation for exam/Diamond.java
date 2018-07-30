import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        String dot=".";
        String star="*";
        int d=3*n;
        int s=4*n;

        for (int row = 0; row < n ; row++) {
            String outerDots=repeatStr(dot,n-row);
            String innerDots=repeatStr(dot,d);
            String innerStars=repeatStr(star,3*n-2);
            if(row==0){
                System.out.println(outerDots+star+innerStars+star+outerDots);

            }
            else{
            System.out.println(outerDots+star+innerDots+star+outerDots);
            d+=2;
        }
        }
        String middleStars=repeatStr(star,5*n);
        System.out.println(middleStars);

        int dots = 1;
        for (int i = 2 * n; i > 0; i--)
        {
            System.out.println((repeatStr(".", dots)+"*"+repeatStr(".", 5*n - 2 - 2 * dots)+
                    "*"+(repeatStr(".", dots))));
            dots++;
        }
        System.out.println(repeatStr(".", dots)+repeatStr("*", n - 2)+
        repeatStr(".",dots));
    }


    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
