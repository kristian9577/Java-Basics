import java.util.Scanner;

public class PointInTheFigure {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int h = Integer.parseInt(console.nextLine());
        int x = Integer.parseInt(console.nextLine());
        int y = Integer.parseInt(console.nextLine());

        //--------------BLOCK 1(BOTTOM)--------------
        boolean botBlockWidth = (x > 0 && x < h * 3);
        boolean botBlockHeight = (y > 0 && y < h * 1);
        //--------------BLOCK 2(TOP)-----------------
        boolean topBlockWidth = (x > h * 1 && x < h * 2);
        boolean topBlockHeight = (y > 0 && y < h * 4);
        //--------------OUTSIDE----------------------
        boolean outsideBlock1 = (x < 0 || x > h * 3) && (y <= h * 1);
        boolean outsideBlock2 = (x < h * 1 || x > h * 2) && (y > h * 1);
        boolean outside = (y < 0 || y > h * 4);
//---------------FIND----------------------------------------------------------
        if((botBlockWidth && botBlockHeight) || (topBlockWidth && topBlockHeight)) {
            System.out.println("inside");
        } else if(outsideBlock1 || outsideBlock2 || outside) {
            System.out.println("outside");
        } else {
            System.out.println("border");
        }
    }
}


