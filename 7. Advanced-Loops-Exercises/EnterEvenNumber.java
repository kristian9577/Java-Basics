import java.util.Scanner;

public class EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n=0;
        while(true) {
            System.out.println("Enter even number: ");
            try {
                n = Integer.parseInt(scan.nextLine());
                if (n % 2 == 0) {
                    System.out.println("Even number entered: " + n);
                    break;
                } else {
                    System.out.println("The number is not even.");
                }
            }catch (NumberFormatException ex){
                System.out.println("Invalid number!");
            }
        }

    }
}
