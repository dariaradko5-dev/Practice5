class CardPayment implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println("Pay card: " + amount + " грн");
    }

    @Override
    public String name() {
        return "Card";
    }
}
