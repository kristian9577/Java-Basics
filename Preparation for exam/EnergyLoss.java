import java.util.Scanner;

public class EnergyLoss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dayForTraining=Integer.parseInt(scan.nextLine());
        int peopleDance=Integer.parseInt(scan.nextLine());

        double allEnergy=0;
        double energy=0;

        allEnergy=dayForTraining*peopleDance*100;

        for (int i = 1; i <=dayForTraining ; i++) {
            int hoursForTraining=Integer.parseInt(scan.nextLine());
            if(i%2==0 && hoursForTraining%2==0){
                allEnergy-=peopleDance*68;
            }
            else if(i%2==1 && hoursForTraining%2==0){
                allEnergy-=peopleDance*49;
            }
            else if(i%2==0 && hoursForTraining%2==1){
                allEnergy-=peopleDance*65;
            }
            else if(i%2==1 && hoursForTraining%2==1){
                allEnergy-=peopleDance*30;
            }
        }
        energy=allEnergy/peopleDance/dayForTraining;
        if(energy<=50){
            System.out.printf("They are wasted! Energy left: %.2f",energy);
        }
        else{
            System.out.printf("They feel good! Energy left: %.2f",energy);
        }
    }
}
