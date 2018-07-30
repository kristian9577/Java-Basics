import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());

        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=9 ; j++) {
                for (int k = 1; k <=9 ; k++) {
                    for (int l = 1; l <=9 ; l++) {
                        for (int m = 1; m <=9 ; m++) {
                            for (int o = 1; o <=9 ; o++) {
                                int total=i*j*k*l*m*o;
                                if(total==n){
                                    System.out.printf("%d%d%d%d%d%d ",i,j,k,l,m,o);
                                }

                            }

                        }

                    }

                }

            }

        }
    }
}
