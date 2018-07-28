import java.util.Scanner;

public class SpecialCombination {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
                int one=Integer.parseInt(scan.nextLine());
                int two=Integer.parseInt(scan.nextLine());
                int three=Integer.parseInt(scan.nextLine());

                for(int i=1;i<=one;i++){
                    for(int j=1;j<=two;j++)
                        for(int k=1;k<=three;k++)
                            if((i%2==0) && (j==2 || j==3 || j==5 || j==7) && (k%2==0))
                                System.out.println(i+" "+j+" "+k);
                }

            }
        }

