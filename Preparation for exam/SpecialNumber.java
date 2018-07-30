import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        StringBuilder stringBuilder = new StringBuilder();

        for (int i =1; i <=9 ; i++) {
            for (int j = 1; j <=9 ; j++) {
                for (int k = 1; k <=9 ; k++) {
                    for (int l = 1; l <=9 ; l++) {
                        if(n%i==0 && n%j==0 && n%k==0 && n%l==0){
                            stringBuilder.append(i);
                            stringBuilder.append(j);
                            stringBuilder.append(k);
                            stringBuilder.append(l);
                            stringBuilder.append(" ");
                        }

                    }

                }

            }

        }
        System.out.printf(stringBuilder.toString());
    }
}
