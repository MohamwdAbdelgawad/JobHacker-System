public class Test {
    public static void main(String[] args) throws IllegalArgumentException {
        Product phone1;



        phone1 = new Product("SAMSUNG GALAXY A50", -10);
        Product phone2 = new Product("SAMSUNG GALAXY A70", 6000);
        Product phone3 = new Product("SAMSUNG GALAXY M31", 7790);
        Product phone4 = new Product("SAMSUNG GALAXY S23 Ultra", 48550.9);

        ShoppingCart cart1 = new ShoppingCart(phone1,phone2);
        ShoppingCart cart2 = new ShoppingCart(phone3,phone4);

        cart1.addItem(phone3);
        cart1.addItem(phone4);

        OrderProcessor order1 = new OrderProcessor(cart1);
        OrderProcessor order2 = new OrderProcessor(cart2);

        order1.placeOrder();
        order2.placeOrder();

    }
}