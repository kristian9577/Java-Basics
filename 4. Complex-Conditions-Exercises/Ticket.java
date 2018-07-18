import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budjet=Double.parseDouble(scan.nextLine());
        String type=scan.nextLine();
        int people=Integer.parseInt(scan.nextLine());

        double ticketVIP=499.99;
        double ticketNormal=249.99;
        double transport;
        double tickets;
        double money;

        if (type.equals("VIP")) {
            if (people >= 1 && people <= 4) {
                transport = budjet - (0.75 * budjet);
                tickets = people * ticketVIP;
                if (transport > tickets) {
                    money = transport - tickets;
                    System.out.printf("Yes! You have %.2f leva left.", money);
                } else {
                    money = transport - tickets;
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(money));
                }
            } else if (people >= 5 && people <= 9) {
                transport = budjet - (0.6 * budjet);
                tickets = people * ticketVIP;
                if (transport > tickets) {
                    money = transport - tickets;
                    System.out.printf("Yes! You have %.2f leva left.", money);
                } else {
                    money = transport - tickets;
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(money));
                }
            } else if (people >= 10 && people <= 24) {
                transport = budjet - (0.5 * budjet);
                tickets = people * ticketVIP;
                if (transport > tickets) {
                    money = transport - tickets;
                    System.out.printf("Yes! You have %.2f leva left.", money);
                } else {
                    money = transport - tickets;
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(money));
                }
            } else if (people >= 25 && people <= 49) {
                transport = budjet - (0.4 * budjet);
                tickets = people * ticketVIP;
                if (transport > tickets) {
                    money = transport - tickets;
                    System.out.printf("Yes! You have %.2f leva left.", money);
                } else {
                    money = transport - tickets;
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(money));
                }
            } else if (people >= 50) {
                transport = budjet - (0.25 * budjet);
                tickets = people * ticketVIP;
                if (transport > tickets) {
                    money = transport - tickets;
                    System.out.printf("Yes! You have %.2f leva left.", money);
                } else {
                    money = transport - tickets;
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(money));
                }
            }
        }
            else if(type.equals("Normal"))
                if(people>=1 && people<=4){
                    transport=budjet-(0.75*budjet);
                    tickets=people*ticketNormal;
                    if(transport>tickets){
                        money=transport-tickets;
                        System.out.printf("Yes! You have %.2f leva left.",money);
                    }else{
                        money=transport-tickets;
                        System.out.printf("Not enough money! You need %.2f leva.",Math.abs(money));
                    }
                }
                else if(people>=5 && people<=9){
                    transport=budjet-(0.6*budjet);
                    tickets=people*ticketNormal;
                    if(transport>tickets){
                        money=transport-tickets;
                        System.out.printf("Yes! You have %.2f leva left.",money);
                    }else{
                        money=transport-tickets;
                        System.out.printf("Not enough money! You need %.2f leva.",Math.abs(money));
                    }
                }
                else if(people>=10 && people<=24){
                    transport=budjet-(0.5*budjet);
                    tickets=people*ticketNormal;
                    if(transport>tickets){
                        money=transport-tickets;
                        System.out.printf("Yes! You have %.2f leva left.",money);
                    }else{
                        money=transport-tickets;
                        System.out.printf("Not enough money! You need %.2f leva.",Math.abs(money));
                    }
                }
                else if(people>=25 && people<=49){
                    transport=budjet-(0.4*budjet);
                    tickets=people*ticketNormal;
                    if(transport>tickets){
                        money=transport-tickets;
                        System.out.printf("Yes! You have %.2f leva left.",money);
                    }else{
                        money=transport-tickets;
                        System.out.printf("Not enough money! You need %.2f leva.",Math.abs(money));
                    }
                }
                else if(people>=50){
                    transport=budjet-(0.25*budjet);
                    tickets=people*ticketNormal;
                    if(transport>tickets){
                        money=transport-tickets;
                        System.out.printf("Yes! You have %.2f leva left.",money);
                    }else{
                        money=transport-tickets;
                        System.out.printf("Not enough money! You need %.2f leva.",Math.abs(money));
                    }
                }
        }
    }

