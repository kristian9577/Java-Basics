import java.util.Scanner;

public class SborILIProizvedenie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int n1 = 0;
        int flag=0;
        for (int a = 1; a <= 30; a++) {
            for (int b = 1; b <= 30; b++) {
                for (int c = 1; c <= 30; c++) {
                    if (a < b && b < c) {
                        n1 = a + b + c;
                        if (n1 == n) {
                            System.out.println(a + " + " + b + " + " + c + " = " + n);
                            flag=1;
                        }
                    } else if (a > b && b > c) {
                        n1 = a * b * c;
                        if (n1 == n) {
                            System.out.println(a + " * " + b + " * " + c + " = " + n);
                            flag=1;
                        }
                    }
                }

            }
        }
        if(flag==0){
            System.out.println("No!");
        }

    }

}

