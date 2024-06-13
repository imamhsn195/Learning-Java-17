import java.util.Scanner;

public class Main {
    public static void announceTeaTime(){
        System.out.println("Waiting for tea time...");
        System.out.println("Please enter anything and then enter to start tea time.");
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        System.out.println("Tea time started...");
    }
    public static void main(String[] args) {
        announceTeaTime();
    }
}