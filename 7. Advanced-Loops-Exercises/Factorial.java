import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int fact=1;

        do{
            fact=fact*n;
            n--;
        }
        while(n>1);{
            System.out.println(fact);
        }
    }
}
