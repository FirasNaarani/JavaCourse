package Pack2;

public class SaleProduct extends Product{
    private int discount;

    public SaleProduct(int discount) {
        this.discount = discount;
    }

    public int calculateFinalPrice(int productPrice){
        return productPrice - discount;
    }
}
