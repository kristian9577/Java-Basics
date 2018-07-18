import java.util.Scanner;

public class Butterfly2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int k=1;
        int l=1;
        int k1=n-2;
        int l1=n-2;
        int spaces=4*n-8;
        int space=4;
        for (int i = 0; i <n-2; i++) {
            System.out.println(repeatStr("*\\",k)+repeatStr(" ",spaces)+
            repeatStr("/*",l));
            k++;
            l++;
            spaces-=4;
        }
        System.out.println(repeatStr("\\/\\/",n-1));
        for (int i = 0; i < n/2; i++) {
            System.out.println(repeatStr("<",2*n-5)+"*|**|*"+repeatStr(">",2*n-5));
        }
        System.out.println(repeatStr("/\\/\\",n-1));

        for (int i = 0; i <n; i++) {
            System.out.println(repeatStr("*/",k1)+repeatStr(" ",space)+
                    repeatStr("\\*",l1));
            k1--;
            l1--;
            space+=4;
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
