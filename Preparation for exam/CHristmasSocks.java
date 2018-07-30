import java.util.Scanner;

public class CHristmasSocks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String tire = "-";
        String vv = "~";
        int t = n - 1;
        int v = 2;
        int v1=2*n-4;
        int t1=2;
        int counter=0;
        int counter1=n-2;
        int half=n/2+1;
        int hald=n/2;

        System.out.println("|" + repeatStr(tire, 2 * n) + "|");
        System.out.println("|" + repeatStr("*", 2 * n) + "|");
        System.out.println("|" + repeatStr(tire, 2 * n) + "|");

        for (int i = 0; i < n - 1; i++) {
                System.out.println("|" + repeatStr(tire, t) + repeatStr(vv, v) + repeatStr(tire, t) + "|");
                t--;
                v += 2;
        }
        for (int i = 0; i <n-2 ; i++) {
            System.out.println("|" + repeatStr(tire, t1) + repeatStr(vv, v1) + repeatStr(tire, t1) + "|");
            t1++;
            v1-=2;
        }
        for (int i = 0; i <n/2 ; i++) {
            System.out.println(repeatStr(tire,i)+"\\"+repeatStr(".",2*n+1)
            +"\\");
            counter++;
        }
        System.out.println(repeatStr(tire,counter)+"\\"+repeatStr(".",counter1)+
        "MERRY"+repeatStr(".",counter1)+"\\");
        counter++;
        System.out.println(repeatStr(tire,counter)+"\\"+repeatStr(".",2*n+1)+"\\");
        counter++;
        System.out.println(repeatStr(tire,counter)+"\\"+repeatStr(".",counter1)+
                "X-MAS"+repeatStr(".",counter1)+"\\");
        counter++;
            if(n%2==1) {
                for (int i = 1; i < half; i++) {
                    System.out.println(repeatStr(tire, counter) + "\\" + repeatStr(".", 2 * n + 1)
                            + "\\");
                    counter++;
                }
            }
            else{
                for (int i = 1; i < hald; i++) {
                    System.out.println(repeatStr(tire, counter) + "\\" + repeatStr(".", 2 * n + 1)
                            + "\\");
                    counter++;
                }
            }
        System.out.println(repeatStr(tire,counter)+"\\"+repeatStr("_",2*n+1)
                +")");


    }



    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
