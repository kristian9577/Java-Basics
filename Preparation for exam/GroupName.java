import java.util.Scanner;

public class GroupName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char theBig = scan.nextLine().charAt(0);
        char theSmallone= scan.nextLine().charAt(0);
        char theSmalltwo= scan.nextLine().charAt(0);
        char thesmallthree= scan.nextLine().charAt(0);
        int number=Integer.parseInt(scan.nextLine());

        int counter=0;

        for (char i = (char) 65; i <=theBig ; i++) {
            for (char j = (char) 97; j <=theSmallone; j++) {
                for (char k = (char) 97; k <=theSmalltwo ; k++) {
                    for (char l = (char) 97; l <=thesmallthree ; l++) {
                        for (int m = 0; m <=number ; m++) {
                            if(i==theBig && j==theSmallone && k==theSmalltwo && l==thesmallthree && m==number){
                                break;
                            }
                            counter++;
                        }

                    }

                }

            }
        }
        System.out.println(counter);
    }
}
