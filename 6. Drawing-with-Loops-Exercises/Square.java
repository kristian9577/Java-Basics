import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());

        System.out.print("+");
        for(int i=0;i<n-2;i++){
            System.out.print(" -");    //TOP
        }
        System.out.println(" +");


        for(int r=0;r<n-2;r++){
            System.out.print("|");
            for(int col=0;col<n-2;col++){       //MIDDLE
                System.out.print(" -");
            }
            System.out.println(" |");
        }


        System.out.print("+");
        for(int c=0;c<n-2;c++){
            System.out.print(" -");    //BOTTOM
        }
        System.out.println(" +");
    }
}
