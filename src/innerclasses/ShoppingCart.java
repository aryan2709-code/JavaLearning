package innerclasses;

public class ShoppingCart {
    private double totalAmount;

    public ShoppingCart(double totalAmount)
    {
        this.totalAmount = totalAmount;
    }

    // paymentMethod is a reference of the interface Payment
    public void processPayment(Payment paymentMethod)
    {
        paymentMethod.pay(totalAmount);
    }

}
