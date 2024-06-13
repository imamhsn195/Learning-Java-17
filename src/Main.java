import java.util.Scanner;

public class Main {
    public static void calculateTotalMealPrice(Double listedPrice, Double tipRate, Double taxRate){
        Double tips = listedPrice * tipRate;
        Double taxes = listedPrice * taxRate;
        Double totalMealPrice = listedPrice + tips + taxes;
        System.out.println("Your total meal price is " + totalMealPrice);
    }
    public static void main(String[] args) {
        calculateTotalMealPrice(15.0,0.3,0.25);
    }
}