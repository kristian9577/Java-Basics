import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit=scan.nextLine();
        String day=scan.nextLine();
        double quanty=Double.parseDouble(scan.nextLine());
        if(day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")){
            if(fruit.equals("banana")){
                System.out.println(quanty*2.5);
            }
            else if(fruit.equals("apple")){
                System.out.println(quanty*1.2);
            }
            else if(fruit.equals("orange")){
                System.out.println(quanty*0.85);
            }
            else if(fruit.equals("grapefruit")){
                System.out.println(quanty*1.45);
            }
            else if(fruit.equals("kiwi")){
                System.out.println(quanty*2.70);
            }
            else if(fruit.equals("pineapple")){
                System.out.println(quanty*5.5);
            }
            else if(fruit.equals("grapes")){
                System.out.println(quanty*3.85);
            }
            else {
                System.out.println("error");
            }
        }
        else if(day.equals("Sunday")||day.equals("Saturday")) {
            if(fruit.equals("banana")){
                System.out.println(quanty*2.7);
            }
            else if(fruit.equals("apple")){
                System.out.println(quanty*1.25);
            }
            else if(fruit.equals("orange")){
                System.out.println(quanty*0.9);
            }
            else if(fruit.equals("grapefruit")){
                System.out.println(quanty*1.6);
            }
            else if(fruit.equals("kiwi")){
                System.out.println(quanty*3);
            }
            else if(fruit.equals("pineapple")){
                System.out.println(quanty*5.6);
            }
            else if(fruit.equals("grapes")){
                System.out.println(quanty*4.2);
            }
            else {
                System.out.println("error");
            }
        }
        else{
            System.out.println("error");
        }

    }
}
