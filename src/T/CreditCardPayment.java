package T;

// Credit Card Payment
public class CreditCardPayment implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Logic to process credit card payment
    }

    @Override
    public boolean isPaymentSuccessful() {
        // Logic to check if payment was successful
        return true;
    }
}
