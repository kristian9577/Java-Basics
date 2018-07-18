import java.util.Scanner;

public class BirthDAY {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int duljina=Integer.parseInt(scan.nextLine());
        int shirochina=Integer.parseInt(scan.nextLine());
        int visochina=Integer.parseInt(scan.nextLine());
        double porcent=Double.valueOf(scan.nextLine());

        int obem=duljina*shirochina*visochina;
        double litri=obem*0.001;
        double precent=porcent*0.01;
        double LITRI=litri*(1-precent);
        System.out.printf("%.3f",LITRI);

    }
}
