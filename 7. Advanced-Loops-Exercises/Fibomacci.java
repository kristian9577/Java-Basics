import java.util.Scanner;

public class Fibomacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int f0=1;
        int f1=1;
        for (int i = 0; i < n-1 ; i++) {
            int fNext=f0+f1;
            f0=f1;
            f1=fNext;
        }
        System.out.println(f1);
    }
}
