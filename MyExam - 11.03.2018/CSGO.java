import java.util.Scanner;

public class CSGO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfThings = Integer.parseInt(scan.nextLine());
        int money = Integer.parseInt(scan.nextLine());

        int moneyForWeapons = 0;
        int mONEY = 0;

        if (numberOfThings > 7) {
            System.out.println("Sorry, you can't carry so many things!");
        }
        else  {
            for (int i = 0; i < numberOfThings; i++) {
                String weapon = scan.nextLine();
                if (weapon.equals("ak47")) {
                    moneyForWeapons = 2700;
                } else if (weapon.equals("awp")) {
                    moneyForWeapons = 4750;
                } else if (weapon.equals("sg553")) {
                    moneyForWeapons = 3500;
                } else if (weapon.equals("grenade")) {
                    moneyForWeapons = 300;
                } else if (weapon.equals("flash")) {
                    moneyForWeapons = 250;
                } else if (weapon.equals("glock")) {
                    moneyForWeapons = 500;
                } else if (weapon.equals("bazooka")) {
                    moneyForWeapons = 5600;
                }
                mONEY += moneyForWeapons;
            }
            if (mONEY <= money) {
                System.out.printf("You bought all %d items! Get to work and defeat the bomb!", numberOfThings);
            } else {
                System.out.printf("Not enough money! You need %d more money.", mONEY - money);
            }
        }
        }
    }

