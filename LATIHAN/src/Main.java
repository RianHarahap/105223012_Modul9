public class Main {
    public static void main(String[] args) {
        PaymentMethod[] payments = {
            new CreditCard(),
            new EWallet(),
            new BankTransfer()
        };

        System.out.println("=== Pembayaran Default ===");
        for (PaymentMethod payment : payments) {
            payment.processPayment(100000);
        }

        System.out.println("\n=== Pembayaran dengan Currency ===");
        payments[0].processPayment(9000000, "USD");
        payments[1].processPayment(6800000, "EUR");
        payments[2].processPayment(1200000, "IDR");
    }
}
