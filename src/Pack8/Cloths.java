package Pack8;

public class Cloths extends Product{
    public String size;
    public String material;

    public Cloths(String name,int price, String description,String size, String material) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return "name= " + name + ", description= " + description + ", price= " + price + "$, size= " + size + ", material= " + material ;
    }
}
