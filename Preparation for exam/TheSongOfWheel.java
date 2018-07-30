import java.util.Scanner;

public class TheSongOfWheel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int counter=0;
        int password=0;

        for (int a = 1; a <=9 ; a++) {
            for (int b = 1; b <=9 ; b++) {
                for (int c = 1; c <=9 ; c++) {
                    for (int d = 1; d <=9 ; d++) {
                      if(a<b && c>d && a*b+c*d==n){
                          System.out.printf("%d%d%d%d ",a,b,c,d);
                          counter++;
                          if(counter==4){
                              password=a*1000+b*100+c*10+d;
                          }
                      }
                    }
                }
            }
        }
        if(counter<4){
            System.out.println();
            System.out.println("No!");
        }
         if(counter>=4){
            System.out.println();
            System.out.printf("Password: %d",password);
        }
    }
}
