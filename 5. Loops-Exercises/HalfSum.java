import java.util.Scanner;

public class HalfSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            int a=Integer.parseInt(scan.nextLine());
            sum+=a;
            if(a>max){
                max=a;
            }
        }
        if((sum-max)==max){
            System.out.println("Yes, Sum = "+(sum-max));
        }
        else{
            System.out.println("No, Diff = "+Math.abs(max-(sum-max)));
        }
    }

}
