import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Playing song one.");
        Boolean isOnRepeat = true;
        Scanner scanner = new Scanner(System.in);
        while (isOnRepeat){
            System.out.println("Do you want to repeat the song again?");
            String userInput = scanner.next();
            if("yes".equals(userInput)){
                System.out.println("Playing song one on repeat.");
            }else{
                isOnRepeat = false;
                System.out.println("Playing next song.");
            }
        }
    }
}