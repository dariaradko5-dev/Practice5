class PaymentProcessor{
    public void process(PaymentMethod method, int amount) {
        System.out.println("Processing payment with " + method.name());
        method.pay(amount);
    }
}