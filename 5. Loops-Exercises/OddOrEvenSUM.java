import java.util.Scanner;

public class OddOrEvenSUM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int Oddsum=0;
        int Evensum=0;

        for(int i=1;i<=n;i++){
        int s=Integer.parseInt(scan.nextLine());
        if(i%2==0){
            Oddsum+=s;
        }
        else{
            Evensum+=s;
        }
    }
      if(Oddsum==Evensum){
          System.out.println("Yes\n"+"Sum = "+Oddsum);
      }
      else{
          System.out.println("No\n"+"Diff = "+Math.abs(Oddsum-Evensum));
      }

    }
}
