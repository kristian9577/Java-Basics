import java.util.Scanner;

public class STIPENDII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double dohodi=Double.valueOf(scan.nextLine());
        double ocenka=Double.valueOf(scan.nextLine());
        double minZaplata=Double.valueOf(scan.nextLine());

        double r=0;
        double s=0;

       if(dohodi<minZaplata && ocenka>4.50){
            s=0.35*minZaplata;
       }
       if(ocenka>=5.50){
            r=ocenka*25;
       }
       if(s>0 || r>0){
           if(s>r){
               System.out.println("You get a Social scholarship "+Math.round(s)+" BGN");
           }
           else{
               System.out.println("You get a scholarship for excellent results "+(int)(Math.floor(r))+" BGN");
           }
       }
       else{
           System.out.println("You cannot get a scholarship!");
       }
    }
}
