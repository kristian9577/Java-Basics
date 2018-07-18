import java.util.Scanner;

public class FruitOrVegatable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inside=scan.nextLine();
        if(inside.equals("banana")||inside.equals("apple")||inside.equals("kiwi")||inside.equals("cherry")||inside.equals("lemon")||inside.equals("grapes")){
            System.out.println("fruit");
        }
        else if(inside.equals("tomato")||inside.equals("cucumber")||inside.equals("pepper")||inside.equals("carrot")){
            System.out.println("vegetable");
        }
        else {
            System.out.println("unknown");
        }
    }
}
