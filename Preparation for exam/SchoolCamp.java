import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sezon = scan.nextLine();
        String typeGroup = scan.nextLine();
        int numberOfKids = Integer.parseInt(scan.nextLine());
        int numberOfNights = Integer.parseInt(scan.nextLine());
        double priceForNight=0;
        String sporst=new String();

        if (sezon.equals("Winter")) {
            if (typeGroup.equals("boys")) {
                priceForNight=9.6;
                sporst="Judo";
            }
            else if(typeGroup.equals("girls")){
                priceForNight=9.6;
                sporst="Gymnastics";
            }
            else if(typeGroup.equals("mixed")){
                priceForNight=10;
                sporst="Ski";
            }
        } else if (sezon.equals("Spring")) {
            if (typeGroup.equals("boys")) {
                priceForNight=7.2;
                sporst="Tennis";
            }
            else if(typeGroup.equals("girls")){
                priceForNight=7.2;
                sporst="Athletics";
            }
            else if(typeGroup.equals("mixed")){
                priceForNight=9.5;
                sporst="Cycling";
            }
        } else if (sezon.equals("Summer")) {
            if (typeGroup.equals("boys")) {
                priceForNight=15;
                sporst="Football";
            }
            else if(typeGroup.equals("girls")){
                priceForNight=15;
                sporst="Volleyball";
            }
            else if(typeGroup.equals("mixed")){
                priceForNight=20;
                sporst="Swimming";
            }
        }
        if(numberOfKids>=50){
        double price=numberOfKids*numberOfNights*priceForNight;
        double allPrice=price-(price*0.5);
            System.out.printf("%s %.2f lv.",sporst,allPrice);
        }
        else if(numberOfKids>=20 && numberOfKids<50){
            double price=numberOfKids*numberOfNights*priceForNight;
            double allPrice=price-(price*0.15);
            System.out.printf("%s %.2f lv.",sporst,allPrice);
        }
        else if(numberOfKids>=10 && numberOfKids<20){
            double price=numberOfKids*numberOfNights*priceForNight;
            double allPrice=price-(price*0.05);
            System.out.printf("%s %.2f lv.",sporst,allPrice);
        }else if(numberOfKids<10){
            double price=numberOfKids*numberOfNights*priceForNight;
            System.out.printf("%s %.2f lv.",sporst,price);
        }

    }
}
