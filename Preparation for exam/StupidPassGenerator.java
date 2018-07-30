import java.util.Scanner;

public class StupidPassGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());
        int l=Integer.parseInt(scan.nextLine());

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (char c = (char) 97; c < (char) l + 97; c++) {
                    for (char d = (char) 97; d < (char) l + 97; d++) {
                        for (int e = 1; e <= n; e++) {
                            if (e > a && e > b) {
                                System.out.printf("%d%d%c%c%d ", a, b, c, d, e);
                            }

                        }

                    }
                    
                }
                
            }

        }
    }
}
