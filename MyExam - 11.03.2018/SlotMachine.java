import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char n = scan.nextLine().charAt(0);
        int n1=Integer.parseInt(scan.nextLine());
        char m = scan.nextLine().charAt(0);
        int m1=Integer.parseInt(scan.nextLine());
        char k = scan.nextLine().charAt(0);
        int k1=Integer.parseInt(scan.nextLine());

        int n2= (int)n+n1;
        int m2=(int)m+m1;
        int k2=(int)k+k1;


        if (n2==64 && m2==64 & k2==64){
            System.out.printf("%c%c%c\n",(char)n2,(char)m2,(char)k2);
            System.out.println("!!! YOU LOSE EVERYTHING !!!");
        }else if(n2==55 && m2==55 & k2==55){
            System.out.printf("%c%c%c\n",(char)n2,(char)m2,(char)k2);
            System.out.println("*** JACKPOT ***");

        }
        else{
            System.out.printf("%c%c%c",(char)n2,(char)m2,(char)k2);
        }
    }
}
