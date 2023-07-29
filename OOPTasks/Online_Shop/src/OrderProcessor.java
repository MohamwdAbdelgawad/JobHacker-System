public class OrderProcessor {
ShoppingCart cart;
public OrderProcessor(ShoppingCart cart)
{
    this.cart=cart;
}
public void placeOrder() {
    System.out.println("Items :");
    for (Product item : cart.getItems()) {
        System.out.println(item.getName() + " $" + item.getPrice() );
    }
    System.out.println();
    System.out.println("Total Prise :  $" + cart.totalPrice());
    System.out.println("-------------------------------------");

}


}
