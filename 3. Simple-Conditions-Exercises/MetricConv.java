import java.util.Scanner;

public class MetricConv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double size =Double.valueOf(scan.nextLine());
        String inMetric=scan.nextLine();
        String outMetric=scan.nextLine();

         if(inMetric.equals("km")){   // IN METRIC
            size=size/0.001;
        }
        else if(inMetric.equals("mm")){
            size=size/1000;
        }
         else if(inMetric.equals("cm")){
             size=size/100;
         }
         else if(inMetric.equals("mi")){
             size=size/0.000621371192;
         }
         else if(inMetric.equals("in")){
             size=size/39.3700787;
         }
         else if(inMetric.equals("ft")){
             size=size/3.2808399 ;
         }
         else if(inMetric.equals("yd")){
             size=size/1.0936133 ;
         }
         if(outMetric.equals("ft")){  //  OUT METRIC
            size=size*3.2808399 ;
        }
         else if(outMetric.equals("yd")){
             size=size*1.0936133 ;
         }
         else if(outMetric.equals("km")){
             size=size*0.001 ;
         }
         else if(outMetric.equals("in")){
             size=size*39.3700787 ;
         }
         else if(outMetric.equals("mi")){
             size=size*0.000621371192 ;
         }
         else if(outMetric.equals("cm")){
             size=size*100 ;
         }
         else if(outMetric.equals("mm")){
             size=size*1000 ;
         }
        System.out.printf("%.8f %s",size,outMetric);
    }
}
