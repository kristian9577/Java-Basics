import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=Integer.parseInt(scan.nextLine());
        int sum=0;

        do{
            sum=sum+(num%10);
            num=num/10;
        }
        while(num>0);
        System.out.println("Sum of digits = "+sum);
    }
}
