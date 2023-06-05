package Pack8;

public class Electronics extends Product{
    public String manufacturer;
    public int batteryCapacity;

    public Electronics(String name,int price,String description, String manufacturer, int batteryCapacity) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.manufacturer = manufacturer;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "name= " + name + ", description= " + description + ", price= " + price + "$, manufacturer= " + manufacturer + ", batteryCapacity= " + batteryCapacity ;
    }
}
