import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pick a number check the result.");
        int inputtedNumber;
        Scanner input = new Scanner(System.in);
        inputtedNumber = input.nextInt();
        String message;

        if(inputtedNumber < 5 ){
            message = " You selected number " + inputtedNumber + " is less than 5";
        }else{
            message = " You selected number " + inputtedNumber + " is greater than 5";
        }

        System.out.println(inputtedNumber + message);
    }
}