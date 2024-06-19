public class Main {

    public static void main(String[] args) {
        double yearlyEarnings = calculateYearlyEarnings(85.5, 35);
        System.out.println("Your total earnings is " + yearlyEarnings);
    }

    public static double calculateYearlyEarnings(double hoursPerWeek, double amountPerHour) {
            // Your code goes here.
            if(hoursPerWeek < 0 || amountPerHour < 0){
                return 0;
            }
            double result = hoursPerWeek * amountPerHour * 52;
            return result;
        }
    }