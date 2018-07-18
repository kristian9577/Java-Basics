import java.util.Scanner;

public class TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());

        for(int r=0;r<n;r++){
            System.out.print("$");
            for(int c=0;c<r;c++){
                System.out.print(" $");
            }
            System.out.println();
        }
    }
}
