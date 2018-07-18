import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());

        for(int row=0;row<n;row++){
            System.out.print("*");
            for(int col=0;col<n-1;col++){
                System.out.print(" *");
                }

            System.out.println();
        }
    }
}
