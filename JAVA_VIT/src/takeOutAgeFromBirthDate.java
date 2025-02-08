import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class takeOutAgeFromBirthDate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you birth year");
        int BirthYear=sc.nextInt();
        System.out.println("Enter you birth month");
        int BirthMonth=sc.nextInt();
        System.out.println("Enter you birth day");
        int BirthDay=sc.nextInt();

        LocalDate today = LocalDate.now(); // Current date
        int birthYear=0;
        int birthMonth=0;
        int birthDay=0;
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
    }
}
