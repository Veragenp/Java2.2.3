public class CreditPaymentService {
    public double calculate(double annualRate, int amountMonths, int sumCredit) {

        double monthlyRate = annualRate / (100 * 12);

        double mounslyPaymant = sumCredit * (monthlyRate / (1 - (Math.pow((1 + monthlyRate), -amountMonths))));

        double mounslyPaymant1 = (int) mounslyPaymant;

        return mounslyPaymant1;
    }
}
