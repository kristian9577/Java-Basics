import java.util.Scanner;

public class HOREOGRAFIA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double stupki=Double.valueOf(scan.nextLine());
        double tanciori=Double.valueOf(scan.nextLine());
        double dni=Double.valueOf(scan.nextLine());

        double stupkiden=Math.ceil(((stupki/dni))/stupki*100);
        double  stupkitancior=stupkiden/tanciori;



        if(stupkiden<=13){
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.",stupkitancior);
        }
        else {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.",stupkitancior);
        }
    }
}
