public class CreditPaymentService {

    public double calculate(double credit, double interestRate, double loanTerm) {
        double mounthRate = ((interestRate / 12)/100);
        double degree = Math.pow((1 + mounthRate), loanTerm);
        double ratio = ((mounthRate * degree) / (degree -1));

       double result = (ratio * credit);
       return result;
    }
}
