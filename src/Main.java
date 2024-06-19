import java.util.Scanner;

public class Main {
    public static double calculateTotalMealPrice(Double listedPrice, Double tipRate, Double taxRate){
        Double tips = listedPrice * tipRate;
        Double taxes = listedPrice * taxRate;
        Double totalMealPrice = listedPrice + tips + taxes;
        return totalMealPrice;
    }
    public static void main(String[] args) {
        double groupMealTotal = calculateTotalMealPrice(100.0,0.2,0.25);
        double perMemberMealTotal = groupMealTotal/5;
        System.out.println("Per member cost: " + perMemberMealTotal);
    }
}