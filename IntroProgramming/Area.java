package IntroProgramming;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
   Scanner console = new Scanner(System.in);
    int a = Integer.parseInt(console.nextLine());
    int b = Integer.parseInt(console.nextLine());
    int area = a*b;
        System.out.println(area);
    }
}
