import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number in range [1...100]: ");
        int n=Integer.parseInt(scan.nextLine());

        while(n<1 || n>100){
            System.out.println("Invalid number!");
            n=Integer.parseInt(scan.nextLine());
        }
        System.out.println("The number is: "+n);
    }
}
