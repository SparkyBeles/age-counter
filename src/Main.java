import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ange ålder?");
        double age = sc.nextDouble();

        int month_year = 12;
        double month_age = age * month_year;



        System.out.println("Din ålder i månader är " + month_age);







    }
}



