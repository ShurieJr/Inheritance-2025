package InterfacePaymentGateway;

// PayPal Payment
public class PayPalPayment implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Logic to process PayPal payment
    }

    @Override
    public boolean isPaymentSuccessful() {
        // Logic to check if payment was successful
        return true;
    }
}
