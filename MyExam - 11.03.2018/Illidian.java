import java.util.Scanner;

public class Illidian {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int groupNumbers=Integer.parseInt(scan.nextLine());
        int powerForOne=Integer.parseInt(scan.nextLine());
        int blood=Integer.parseInt(scan.nextLine());

        int allpower=groupNumbers*powerForOne;
        if(allpower>=blood){
            System.out.print("Illidan has been slain!");
            System.out.printf(" You defeated him with %d points.",(allpower-blood));
        }
        else{
            System.out.print("You are not prepared!");
            System.out.printf(" You need %d more points.",(blood-allpower));
        }
    }
}
