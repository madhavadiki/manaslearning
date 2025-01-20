public class ProductApp {
    public static void main(String[] args) {
        Product product1 = new Product("carrot", 100., 5);
        product1.applyDiscount(10);
        product1.displayProductInfo();
        product1.calculateTotalValue();
    }
    
}
