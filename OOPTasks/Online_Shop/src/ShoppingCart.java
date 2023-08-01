import java.util.ArrayList;

public class ShoppingCart {
   private ArrayList<Product> cartItems;
   public ShoppingCart(Product... items)
   {
       cartItems= new ArrayList<>();
       for(Product p : items)
       {
           cartItems.add(p);
       }
   }
   public void addItem(Product item)
   {
       cartItems.add(item);
   }
    public void removeItem(Product item)
    {
        cartItems.remove(item);
    }
    public ArrayList<Product> getItems()
    {
        return cartItems;
    }
    public double totalPrice()
    {
        double totalPrice = 0;
        for(Product i : this.cartItems)
        {
            totalPrice+= i.getPrice();
        }
        return totalPrice;
    }
}
