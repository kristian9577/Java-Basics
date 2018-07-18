import java.util.Scanner;

public class TrainLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double h=Double.parseDouble(scan.nextLine());
        double w=Double.parseDouble(scan.nextLine());

        //convert next two values to cm

        double length = h * 100;
        double width = w * 100 - 100; //taking out 100cm in advance due to the width of the central isle

        /* making sure the number is rounded down, we don't need remainder*/

        double numberOfRows = Math.floor(length / 120);
        double numberOfColumns = Math.floor(width / 70);

        double numberOfSeats = numberOfColumns * numberOfRows - 3; //taking out 3 seats due to the teacher's desk+door
        System.out.println((int) numberOfSeats);


    }
}
