import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int first=n/100;
        int second=n/10%10;
        int three=n%10;
        int number=0;
        for (int i = 1; i <=three ; i++) {
            for (int j = 1; j <=second ; j++) {
                for (int k = 1; k <=first ; k++) {
                    number=k*j*i;
                    System.out.printf("%d * %d * %d = %d;\n",i,j,k,number);
                }

            }

        }

    }
}
