public class VidyaBooksApp {
    public static void main(String[] args){
        Book book1 = new Book("lion king", "mufasa", 100.23, true);
        Book book2 = new Book("harry porter", "porter", 200., false);
        Book book3 = new Book("tiger king", "tiger", 300., true);
        System.out.println("total asset value: :" + (book1.price + book2.price + book3.price));
        book1.applyDiscount(5);
        book1.publish();
        //System.out.println(book1.price);
        book2.applyDiscount(20);
        book2.publish();
        book3.publish();
      
    }
}
