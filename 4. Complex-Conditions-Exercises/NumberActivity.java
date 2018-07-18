import java.util.Scanner;

public class NumberActivity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1=Integer.parseInt(scan.nextLine());
        int n2=Integer.parseInt(scan.nextLine());
        String type=scan.nextLine();
        double a=0.0;

        if(type.equals("+")){
             a=n1+n2;
            if(a%2==0){
                System.out.println(n1+" + "+n2+" = "+(int)a+" - even");
            }
            else{
                System.out.println(n1+" + "+n2+" = "+(int)a+" - odd");
            }
        }
        else if(type.equals("-")){
             a=n1-n2;
            if(a%2==0){
                System.out.println(n1+" - "+n2+" = "+(int)a+" - even");
            }
            else{
                System.out.println(n1+" - "+n2+" = "+(int)a+" - odd");
            }
        }
        else if(type.equals("*")){
             a=n1*n2;
            if(a%2==0){
                System.out.println(n1+" * "+n2+" = "+(int)a+" - even");
            }
            else{
                System.out.println(n1+" * "+n2+" = "+(int)a+" - odd");
            }
        }
        else if(type.equals("/")){
            if(n2==0){
                System.out.println("Cannot divide "+n1+" by zero");
            }
            else if(n1==0){
                System.out.println("Cannot divide "+n2+" by zero");
            }
            else{
             a=(double)n1/n2;
                System.out.printf("%d / %d = %.2f",n1,n2,a);
        }
        }
        else if(type.equals("%")){
            if( n2==0){
                System.out.println("Cannot divide "+n1+" by zero");
            }
            else if(n1==0){
                System.out.println("Cannot divide "+n2+" by zero");
            }
            else{
                a=n1%n2;
                System.out.printf("%d %% %d = %d",n1,n2,(int)Math.abs(a));
            }
        }

    }
}
