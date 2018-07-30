import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width=Integer.parseInt(scan.nextLine());
        int lenght=Integer.parseInt(scan.nextLine());
        String command=scan.nextLine();

        int cakeArea=width*lenght;

        while(!"STOP".equals(command)){
            int cakePieces=Integer.parseInt(command);
            cakeArea-=cakePieces;
            if(cakeArea<0){
                int neededPieces=Math.abs(cakeArea);
                System.out.printf("No more cake left! You need %d pieces more.\n",neededPieces);
                break;
            }
            command=scan.nextLine();
        }
        if(cakeArea>0){
        System.out.printf("%d pieces are left.\n",cakeArea );
    }
    }
}
