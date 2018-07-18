import java.util.Scanner;

public class equalWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1=scan.nextLine();
        String word2=scan.nextLine();

        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        }
    }

