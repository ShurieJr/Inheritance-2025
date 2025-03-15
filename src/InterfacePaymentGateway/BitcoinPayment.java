package InterfacePaymentGateway;

// Bitcoin Payment
public class BitcoinPayment implements PaymentGateway  {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
        // Logic to process Bitcoin payment
    }

    @Override
    public boolean isPaymentSuccessful() {
        // Logic to check if payment was successful
        return true;
    }

}
