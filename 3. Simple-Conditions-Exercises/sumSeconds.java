import java.util.Scanner;

public class sumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s1 = Integer.parseInt(scan.nextLine());
        int s2 = Integer.parseInt(scan.nextLine());
        int s3 = Integer.parseInt(scan.nextLine());
        int sec = s1 + s2 + s3;
//        int min = sec / 60;
//        int sec1 = sec % 60;
//
//        if (sec1 < 10) {
//            System.out.println(min + ":0" + sec1); (po-lesen metod)
//        } else {
//            System.out.println(min + ":" + sec1);
//        }

        if(sec>0 && sec<=59){
            if(sec < 10) {
                System.out.printf("%d:%d%d", 0, 0, sec);
            } else if(sec >= 10) {
                System.out.printf("%d:%d", 0, sec);
            }
        }
        else if(sec>=60 && sec<=119){
            sec-=60;
            if(sec < 10) {
                System.out.printf("%d:%d%d", 1, 0, sec);
            } else if(sec >= 10) {
                System.out.printf("%d:%d", 1, sec);
            }
        }
        else if (sec>=120 && sec<=179){
            sec-=120;
            if(sec < 10) {
                System.out.printf("%d:%d%d", 2, 0, sec);
            } else if(sec >= 10) {
                System.out.printf("%d:%d", 2, sec);
            }
        }

    }
}
