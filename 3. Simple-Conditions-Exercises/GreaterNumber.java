import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        if(a>b){
            System.out.println("Greater number: " + a);
        }
        else{
            System.out.println("Greater number: " + b);
        }

    }
}
