import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());
        String type=scan.nextLine();

        if(n<20){
            if(type.equals("day")){
                double taxi=0.7+n*0.79;
                System.out.println(taxi);
            }
            else if(type.equals("night")){
                double taxi=0.7+n*0.9;
                System.out.println(taxi);
            }
        }
        else if(n>=20 && n<100){
            if(type.equals("day")){
                double pay=n*0.09;
                System.out.println(pay);
            }
            else if(type.equals("night")){
                double pay=n*0.09;
                System.out.println(pay);
            }
        }
        else if(n>=100){
            if(type.equals("day")){
                double pay=n*0.06;
                System.out.println(pay);
            }
            else if(type.equals("night")){
                double pay=n*0.06;
                System.out.printf("%.1f",pay);;
            }
        }
    }
}
