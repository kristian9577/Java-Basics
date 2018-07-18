import java.util.Scanner;

public class SmallNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int min = Integer.MAX_VALUE;

        for(int i=1;i<=n;i++){
            int s=Integer.parseInt(scan.nextLine());
            if(s<min){
                min=s;
            }
        }
        System.out.println(min);
    }
}
