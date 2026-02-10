//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            PaymentProcessor processor = new PaymentProcessor();
            PaymentMethod card = new CardPayment();
            PaymentMethod paypal = new PaypalPayment();
            processor.process(card, 1000);
            processor.process(paypal, 500);
            System.out.println();
            card.payWithFee(1000, 25);
            paypal.payWithFee(500, 10);
        }
}


