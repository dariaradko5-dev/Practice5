interface PaymentMethod {
    String name();

    void pay(int amount);

    default void payWithFee(int amount, int fee) {
        int totalAmount = amount + fee;
        System.out.println("Total amount to pay: " + totalAmount);
        pay(totalAmount);
    }
}



