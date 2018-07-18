import java.util.Scanner;

public class NumberTo100 {
    public static void main(String[] args) {
        String[] shortName = new String[] { "zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"};
        String[] compositeName = new String[] { "twen", "thir", "four", "fif", "six", "seven", "eigh", "nine" };
        String name = "";
        Scanner scan = new Scanner(System.in);
        int a=Integer.parseInt(scan.nextLine());

        if((a<0) || (a>100)){
            name="invalid number";
        }
        else if(a<13){
            name=shortName[a];
        }
        else if(a<20){
            name=compositeName[a%10-2]+"teen";
        }
        else if(a<100){
            if(a/10==4){
                name="forty";
            }
            else {
                name=compositeName[a/10-2]+"ty";
            }
            if(a%10!=0){
                name+=" "+ shortName[a%10];
            }
        }
        else{
            name="one hundred";
        }
        System.out.println(name);
    }
}
