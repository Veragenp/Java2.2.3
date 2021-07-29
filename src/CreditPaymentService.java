public class CreditPaymentService {
    public double calculate(double annualRate, int amountMonths, int sumCredit) {

        double monthlyRate = annualRate / (100 * 12);

        int amountYears = 1;
        double x = 1 + monthlyRate;
        int z = -amountMonths;
        double v = Math.pow(x, z);

        double mounslyPaymant = sumCredit * (monthlyRate / (1 - v));

        return mounslyPaymant;
    }
}
