public class PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Generic: Processing payment of " + amount + " IDR.");
    }

    public void processPayment(double amount, String currency) {
        System.out.println("Generic: Processing payment of " + amount + " in " + currency + ".");
    }
}
