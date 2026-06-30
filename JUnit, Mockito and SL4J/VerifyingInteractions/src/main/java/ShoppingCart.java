public class ShoppingCart {

    private PaymentGateway paymentGateway;

    public ShoppingCart(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(double totalAmount) {
        paymentGateway.processPayment(totalAmount);
    }
}