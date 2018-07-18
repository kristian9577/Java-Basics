import java.util.Scanner;

public class Stop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());

        int down=2*n-1;
        int t=n;
        System.out.println(repeatStr(".",n+1)+repeatStr("_",2*n+1)+
                repeatStr(".",n+1));
        for (int i = 0; i <n ; i++) {
            System.out.println(repeatStr(".",t)+"//"+repeatStr("_",down)+
            "\\\\"+repeatStr(".",t));
            down+=2;
            t--;
        }
        System.out.println("//"+repeatStr("_",2*n-3)+"STOP!"+repeatStr("_",2*n-3)+"\\\\");

        for (int i = 0; i <n ; i++) {
            System.out.println(repeatStr(".",t)+"\\\\"+repeatStr("_",down)+
                    "//"+repeatStr(".",t));
            down-=2;
            t++;
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
