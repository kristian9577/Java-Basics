import java.util.Scanner;

public class LeftOrRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int leftSum=0;
        int rightSum=0;

        for (int i=1;i<=n;i++){
            int a=Integer.parseInt(scan.nextLine());
            leftSum+=a;
        }
        for(int i=1;i<=n;i++){
            int a=Integer.parseInt(scan.nextLine());
            rightSum+=a;
        }
        if(leftSum==rightSum){
            System.out.println("Yes, sum = "+leftSum);
        }
        else{
            System.out.println("No, diff = "+Math.abs(leftSum-rightSum));
        }
    }
}
