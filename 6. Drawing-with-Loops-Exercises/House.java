import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());

        int stars=1;
        if(n%2==0){
            stars++;
        }
        for(int i=0; i<(n+1)/2;i++){
            int padding=(n-stars)/2;
            System.out.print(repeatStr("-",padding));
            System.out.print(repeatStr("*",stars));
            System.out.println(repeatStr("-",padding));
            stars+=2;
        }
        for(int i=0; i<(n/2); i++){
            System.out.println("|"+repeatStr("*",n-2)+"|");
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
