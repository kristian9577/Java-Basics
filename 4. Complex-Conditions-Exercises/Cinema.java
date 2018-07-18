import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type=scan.nextLine();
        int red=Integer.parseInt(scan.nextLine());
        int kolona=Integer.parseInt(scan.nextLine());
        double money=0.0;
        if(type.equals("Premiere")){
            money=red*kolona*12;
            System.out.printf("%.2f leva",money);
        }
        else if(type.equals("Normal")){
            money=red*kolona*7.5;
            System.out.printf("%.2f leva",money);
        }
        else if(type.equals("Discount")){
            money=red*kolona*5;
            System.out.printf("%.2f leva",money);
        }
    }
}
