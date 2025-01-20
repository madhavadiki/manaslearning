public class SandyaBooksApp {
    public static void main(String[] args){
        Book book1 = new Book("lion king", "mufasa", 100.23, true);
        Book book2 = new Book("harry porter", "porter", 200., false);
        Book book3 = new Book("tiger king", "tiger", 300., true);
        System.out.println(book1.price + book2.price + book3.price);
        book1.publish();
        book1.applyDiscount(15);
        book2.applyDiscount(25);
        book2.publish();
        book3.applyDiscount(30);
        book3.publish();
      
    }
}
