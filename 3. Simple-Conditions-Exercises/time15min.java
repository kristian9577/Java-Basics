import java.util.Scanner;

public class time15min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours=Integer.parseInt(scan.nextLine());
        int min=Integer.parseInt(scan.nextLine());

        if(min>=45){
            hours++;
            min=(min+15)-60;
            if(hours==24){
                hours=0;
            }
            if(min<10){
                System.out.println(hours+":0"+min);
            }
            else{
                System.out.println(hours+":"+min);
            }
        }else{
            min+=15;
            System.out.println(hours+":"+min);
        }

    }
}
