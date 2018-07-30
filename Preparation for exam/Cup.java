import java.util.Scanner;

public class Cup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        String dot=".";
        String sharp="#";
        String innerDot=".";
        int t=0;
        int widht=5*n;

        for (int i = 0; i <= n ; i++) {
            if(i<n/2) {
                    innerDot=sharp;
                System.out.println(repeatStr(dot, n + i) + sharp + repeatStr(innerDot, 3 * n - 2 - 2 * i)
                        + sharp + repeatStr(dot, n + i));
            }
            else{

                System.out.println(repeatStr(dot, n + i) + sharp + repeatStr(dot, 3 * n - 2 - 2 * i)
                        + sharp + repeatStr(dot, n + i));
            }
        }
        System.out.println(repeatStr(dot,2*n)+repeatStr(sharp,n)+repeatStr(dot,2*n));
        for (int i = 1; i <n/2+1 ; i++) {
            t=n/2;
            if(t%2==1){
                t++;
            }
                System.out.println(repeatStr(dot, 2 * n - 2) + repeatStr(sharp, n + 4)
                        + repeatStr(dot, 2 * n - 2));
            }
        System.out.println(repeatStr(dot, (5 * n - 10)/2) + "D^A^N^C^E^"
                + repeatStr(dot, (5 * n - 10)/2));
        for (int i = 1; i <=n/2+1 ; i++) {
            t=n/2;
            if(t%2==1){
                t++;
            }
            System.out.println(repeatStr(dot, 2 * n - 2) + repeatStr(sharp, n + 4)
                    + repeatStr(dot, 2 * n - 2));
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
