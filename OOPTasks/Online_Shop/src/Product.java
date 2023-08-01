public class Product {
    private String name;
    private double price;
    public Product(String name , double price)
    {
        this.setName(name)  ;
        this.setPrice(price);
    }
    public String getName()
    {
        return this.name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPrice(double price) {

            this.price = price;

    }
}
