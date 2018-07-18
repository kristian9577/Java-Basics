import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a= Double.parseDouble(scan.nextLine());
        String b=scan.nextLine();
            if(a<16){
            if(b.equals("f")){
                System.out.println("Miss");
            }
            else if(b.equals("m")){
            System.out.println("Master");}
        }
        else{
                if(b.equals("f")){
                    System.out.println("Ms.");
                }
                else if(b.equals("m")){
                System.out.println("Mr."); }
            }
    }
}
