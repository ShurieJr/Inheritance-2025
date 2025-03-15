package InterfacePaymentGateway;

public  class EvcPayment implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("processing evc payment of $ " + amount);
    }

    @Override
    public boolean isPaymentSuccessful() {
        return false;
    }
}
