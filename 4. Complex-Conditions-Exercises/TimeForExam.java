import java.util.Scanner;

public class TimeForExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  TimeExam1=Integer.parseInt(scan.nextLine());
        int  TimeExam2=Integer.parseInt(scan.nextLine());
        int  ArrivedTime=Integer.parseInt(scan.nextLine());
        int  ArrivedTime1=Integer.parseInt(scan.nextLine());

        int difference=(TimeExam1*60+TimeExam2)-(ArrivedTime*60+ArrivedTime1);
        int hour=difference/60;
        int min=difference%60;

        if(difference>30){
            System.out.println("Early");
            if(difference>=31 && difference<=59){
                System.out.printf("%02d minutes before the start",difference);
            }
            else {
                System.out.printf("%d:%02d hours before the start",hour,min);
            }
        }
        else if((difference<=30 && difference>0)|| difference==0){
            System.out.println("On time");
            if(difference<=30 && difference>0){
            System.out.printf("%d minutes before the start",difference);
        }
        else{

            }
        }
        else if(difference<0){
            System.out.println("Late");
            if(difference<=-1 && difference>=-9){
                System.out.printf("%02d minutes after the start",Math.abs(difference));
            }
            else if(difference<-9 && difference>=-59){
                System.out.printf("%d minutes after the start",Math.abs(difference));
            }
            else{
                System.out.printf("%d:%02d hours after the start",Math.abs(hour),Math.abs(min));
            }

        }


    }
}
