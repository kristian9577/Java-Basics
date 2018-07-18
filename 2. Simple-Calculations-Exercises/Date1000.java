import java.util.Scanner;
import java.time.format.*;
import java.time.LocalDate;

public class Date1000 {
    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String text=scan.nextLine();
        LocalDate ParsedDate=LocalDate.parse(text,formatter);
        LocalDate After1000=ParsedDate.plusDays(999);
        System.out.printf("%1$td-%1$tm-%1$tY",After1000);

    }
}