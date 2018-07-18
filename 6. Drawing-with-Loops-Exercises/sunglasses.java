import java.util.Scanner;

public class sunglasses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());

            String Z =repeatStr("*",2*n);
            String S= repeatStr(" ",n);
            System.out.println(Z+S+Z);
            for(int i=0; i<n-2;i++){
                System.out.print("*"+repeatStr("/",2*n-2)+"*");
                if(i==(n-1)/2-1){
                    System.out.print(repeatStr("|",n));
                }
                else{
                    System.out.print(repeatStr(" ",n));
                }
                System.out.print("*"+repeatStr("/",2*n-2)+"*");
                System.out.println();
            }
        System.out.print(Z+S+Z);

    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
