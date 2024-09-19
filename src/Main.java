import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ange ålder?");
        double age_user_input = sc.nextDouble();


         Age age_converter = new Age();

         System.out.println("Ålder i månader " + age_converter.age_month(age_user_input));
        System.out.println("Ålder i veckor " + age_converter.age_week(age_user_input));
        System.out.printf("Ålder i minuter: %.0f\n ",+ age_converter.age_minute(age_user_input));









    }
}



