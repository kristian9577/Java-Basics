import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int num=1;
        for (int i= 0; i <=n ; i++) {

            System.out.println(num);

            num=num*2;
        }
    }
}
