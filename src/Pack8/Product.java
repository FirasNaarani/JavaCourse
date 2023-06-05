package Pack8;

public abstract class Product {
    public String name;
    public String description;
    public int price;

    @Override
    public String toString() {
        return "name= " + name + ", description= " + description + ", price= " + price + "$" ;

    }
}
