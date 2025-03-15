package T;

public interface PaymentGateway {
  public abstract void processPayment(double amount); // Method to process payment
    boolean isPaymentSuccessful();      // Method to check if payment was successful
}
