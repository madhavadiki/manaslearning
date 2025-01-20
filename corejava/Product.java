public class Product {
    String name;
    double price;
    int qty;
    public Product(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    public void applyDiscount(double discountPercentage) {
        price = price - price * (discountPercentage / 100);
    }

    private double calculateTotalValue() {
        return price * qty;
    }

    public void displayProductInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Cost Price: " + calculateTotalValue());
        System.out.println();
    }

}
