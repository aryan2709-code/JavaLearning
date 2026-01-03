package innerclasses;

public class Test {
   public static void main() {
       ShoppingCart shoppingCart = new ShoppingCart(150);
       // This processPayment method expects an implementation of the Payment Interface
       // So, we create a class called CreditCard which implements this Interface called Payment.
       CreditCard creditCard = new CreditCard();
       // What if instead of writing a complete implementation of the credit card class, we could
       // write a separate class on the fly.  That's where anonymous class comes in.

       // The below line shows the traditional method
       // shoppingCart.processPayment(creditCard);

       // If we have to create an object on the fly for an implementation class without
       // creating implementation class, then you can follow the below method
       shoppingCart.processPayment(new Payment() {
           @Override
           public void pay(double amount) {
               System.out.println("Paid" + amount + " using credit card");
           }
       });

       shoppingCart.processPayment(new Payment() {
           @Override
           public void pay(double amount) {
               System.out.println("Paid" + amount + " using Paypal");
           }
       });
    }
}
