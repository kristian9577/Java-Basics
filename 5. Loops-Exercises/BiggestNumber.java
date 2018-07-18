import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int max= Integer.MIN_VALUE;

        for(int i=1;i<=n;i++){
            int s=Integer.parseInt(scan.nextLine());
            if(s>max){
                max=s;
            }
        }
        System.out.println(max);
    }
}
