package FinancialForecasting;

public class Forecast {

    public static double futureValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return futureValue(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialValue = 10000;
        double growthRate = 0.05;
        int years = 5;

        double result = futureValue(initialValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: ₹" + result);
    }
}


