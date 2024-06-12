import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 4.45;
        String firstName = "Imam";
        String lastName = "Hasan";
        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);
        System.out.println("Age: " + studentAge);
        System.out.println("GPA: " + studentGPA);
        System.out.println("First Initial : " + firstInitial);
        System.out.println("Last Initial: " + lastInitial);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println(firstName + " " + lastName + " has of GPA " + studentGPA);

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(firstName + " " + lastName + " now has of GPA " + studentGPA);
    }
}