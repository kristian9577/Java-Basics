import java.util.Scanner;

public class VolewstSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int evenSum=0;
        int oddSum=0;

        for (int i=1; i<=n; i++){
            int a=Integer.parseInt(scan.nextLine());
            if(i%2==0){
                evenSum+=a;
            }
            else{
                oddSum+=a;
            }
        }
        if(evenSum==oddSum){
            System.out.println("Yes, Sum = "+evenSum);
        }
        else{
            System.out.println("No, Diff = "+Math.abs(evenSum-oddSum));
        }
    }
}
