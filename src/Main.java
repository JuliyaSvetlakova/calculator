
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double credit = 1000000f;
        double interestRate = 9.99f;
        double loanTerm = 36f;
        int monthlyPayment = (int) service.calculate(credit, interestRate, loanTerm);

        System.out.println("Ежемесячный платеж:" + monthlyPayment);
    }
}
