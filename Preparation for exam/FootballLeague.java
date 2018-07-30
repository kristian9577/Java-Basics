import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stadiumPeople=Integer.parseInt(scan.nextLine());
        int fans=Integer.parseInt(scan.nextLine());
        double a=0;
        double b=0;
        double g=0;
        double v=0;

        for (int i = 0; i <fans ; i++) {
            char c = scan.next().charAt(0);
            switch (c) {
                case 'A':
                    a++;
                    break;
                case 'B':
                    b++;
                    break;
                case 'V':
                    v++;
                    break;
                case 'G':
                    g++;
                    break;
            }
        }

        System.out.printf("%.2f%%\n",a/fans*100);
        System.out.printf("%.2f%%\n",b/fans*100);
        System.out.printf("%.2f%%\n",v/fans*100);
        System.out.printf("%.2f%%\n",g/fans*100);
        System.out.printf("%.2f%%",(double)fans/stadiumPeople*100);


    }
}
