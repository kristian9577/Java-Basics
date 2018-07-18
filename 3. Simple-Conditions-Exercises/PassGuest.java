import java.util.Scanner;

public class PassGuest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pass=scan.nextLine();
        if(pass.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        }
        else{
            System.out.println("Wrong password!");
        }
    }
}
