public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double mounslyPaymant1 = service.calculate(9.99, 12, 1000000);
        System.out.printf("Ежемесячный платеж - " + "%.0f", mounslyPaymant1);

        double mounslyPaymant2 = service.calculate(9.99, 24, 1000000);
        System.out.printf("Ежемесячный платеж - " + "%.0f", mounslyPaymant2);

        double mounslyPaymant3 = service.calculate(9.99, 36, 1000000);
        System.out.printf("Ежемесячный платеж - " + "%.0f", mounslyPaymant3);
    }
}
