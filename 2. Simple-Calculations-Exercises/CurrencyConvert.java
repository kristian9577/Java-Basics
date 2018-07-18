import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] agrs) {

        Scanner scan = new Scanner(System.in);

        double cash = Double.parseDouble(scan.nextLine());
        String firstValue = scan.nextLine();
        String finishValue = scan.nextLine();

        if (firstValue.equals("BGN")) {
            if (finishValue.equals("USD")) {
                cash = cash / 1.79549;
                System.out.printf("%.2f ", cash);
                System.out.println(finishValue);
            } else if (finishValue.equals("GBP")) {
                cash = cash / 2.53405;
                System.out.printf("%.2f ", cash);
                System.out.println(finishValue);

            } else if (finishValue.equals("EUR")) {
                cash = cash / 1.95583;
                System.out.printf("%.2f ", cash);
                System.out.println(finishValue);
            }
        } else if (firstValue.equals("USD")) {
            if (finishValue.equals("BGN")) {
                cash = cash * 1.79549;
                System.out.printf("%.2f ", cash);
                System.out.println(finishValue);
            } else if (finishValue.equals("EUR")) {
                cash = cash / 1.08933;
                System.out.printf("%.2f ", cash);
                System.out.println(finishValue);
            } else if (finishValue.equals("GBP")) {
                cash = cash * 0.735800;
                System.out.printf("%.2f ", cash);
                System.out.println(finishValue);
            }
        } else if (firstValue.equals("GBP")) {
            if (finishValue.equals("BGN")) {
                cash = cash * 2.53405;
                System.out.printf("%.2f ", cash);
                System.out.println(finishValue);
            } else if (finishValue.equals("USD")) {
                cash = cash * 1.41133;
                System.out.printf("%.2f ", cash);
                System.out.println(finishValue);
            } else if (finishValue.equals("EUR")) {
                cash = cash * 1.29590;
                System.out.printf("%.2f ", cash);
                System.out.println(finishValue);

            }
        } else if (firstValue.equals("EUR")) {
            if (finishValue.equals("BGN")) {
                cash = cash * 1.95583;
                System.out.printf("%.2f ", cash);
                System.out.println(finishValue);
            } else if (finishValue.equals("USD")) {
                cash = cash * 1.08933;
                System.out.printf("%.2f ", cash);
                System.out.println(finishValue);
            } else if (finishValue.equals("GBP")) {
                cash = cash / 1.29590;
                System.out.printf("%.2f ", cash);
                System.out.println(finishValue);

            }
        }
    }
}