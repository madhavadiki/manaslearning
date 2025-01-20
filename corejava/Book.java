public class Book {
    String title;
    String author;
    double price;
    boolean isAvailable;

public Book(String title, String author, Double price, boolean isAvailable){
    this.title = title;
    this.author = author;
    this.price = price;
    this.isAvailable = isAvailable;
}
public void publish(){
    System.out.print("Title: "+ title);
    System.out.print(", Author: " + author);
    System.out.print(", Price: " + price);
    System.out.println(", Availability: " +  isAvailable);
}

public void applyDiscount(int p1){
    price =price-(price*p1/100);
}

}
