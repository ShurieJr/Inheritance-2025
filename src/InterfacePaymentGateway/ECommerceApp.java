package InterfacePaymentGateway;

public class ECommerceApp {
    public static void main(String[] args) {
        // Customer selects a payment method
        PayPalPayment paymentMethod = new PayPalPayment();
        // Can be PayPalPayment or BitcoinPayment

        // Process payment
        paymentMethod.processPayment(100.0);

        // Check if payment was successful
        if (paymentMethod.isPaymentSuccessful()) {
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment failed.");
        }
    }
}
