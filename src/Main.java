import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ange ålder?");
        double age = sc.nextDouble();

        int month_year = 12;
        double month_age = age * month_year;
        double week_age = age * 52.14 ;
        float minute_age = (float) (age * 365.25 * 24 * 60);



        System.out.println("Din ålder i månader är " + month_age);
        System.out.println("Din ålder i veckor är " + week_age);
        System.out.println("Din ålder i minuter är " + minute_age);






    }
}



