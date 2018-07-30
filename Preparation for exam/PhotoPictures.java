import java.util.Scanner;

public class PhotoPictures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valuePictures=Integer.parseInt(scan.nextLine());
        String typePictures=scan.nextLine();
        String typeOrder=scan.nextLine();

        double s=0;
        double s1=0;
        double price=0;

        if(typePictures.equals("9X13")){
            if(valuePictures>=50){
                 s=valuePictures*0.16;
                 s1=s*0.95;
                if(typeOrder.equals("online")){
                    price=s1*0.98;
                    System.out.printf("%.2fBGN",price);
                }
                else if(typeOrder.equals("office")){
                    System.out.printf("%.2fBGN",s1);
                }
            }
            else {
                 s=valuePictures*0.16;
                if(typeOrder.equals("online")){
                    price=s*0.98;
                    System.out.printf("%.2fBGN",price);
                }
                else if(typeOrder.equals("office")){
                    System.out.printf("%.2fBGN",s);
                }
            }
        }
        else if(typePictures.equals("10X15")){
            if(valuePictures>=80){
                s=valuePictures*0.16;
                s1=s*0.97;
                if(typeOrder.equals("online")){
                    price=s1*0.98;
                    System.out.printf("%.2fBGN",price);
                }
                else if(typeOrder.equals("office")){
                    System.out.printf("%.2fBGN",s1);
                }
            }
            else {
                s=valuePictures*0.16;
                if(typeOrder.equals("online")){
                    price=s*0.98;
                    System.out.printf("%.2fBGN",price);
                }
                else if(typeOrder.equals("office")){
                    System.out.printf("%.2fBGN",s);
                }
            }
        }
        else if(typePictures.equals("13X18")){
            if(valuePictures>=50 && valuePictures<=100){
                s=valuePictures*0.38;
                s1=s*0.97;
                if(typeOrder.equals("online")){
                    price=s1*0.98;
                    System.out.printf("%.2fBGN",price);
                }
                else if(typeOrder.equals("office")){
                    System.out.printf("%.2fBGN",s1);
                }
            }
            else if(valuePictures>100){
                s=valuePictures*0.38;
                s1=s*0.95;
                if(typeOrder.equals("online")){
                    price=s1*0.98;
                    System.out.printf("%.2fBGN",price);
                }
                else if(typeOrder.equals("office")){
                    System.out.printf("%.2fBGN",s1);
                }
            }
        }
        else if(typePictures.equals("20X30")){
            if(valuePictures>=10 && valuePictures<=50){
                s=valuePictures*2.9;
                s1=s*0.93;
                if(typeOrder.equals("online")){
                    price=s1*0.98;
                    System.out.printf("%.2fBGN",price);
                }
                else if(typeOrder.equals("office")){
                    System.out.printf("%.2fBGN",s1);
                }
            }
            else if(valuePictures>50){
                s=valuePictures*2.9;
                s1=s*0.91;
                if(typeOrder.equals("online")){
                    price=s1*0.98;
                    System.out.printf("%.2fBGN",price);
                }
                else if(typeOrder.equals("office")){
                    System.out.printf("%.2fBGN",s1);
                }
            }
        }


    }
}
