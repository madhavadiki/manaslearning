public class Car {
    // Fields
    String company;
    String model;
    int year;

    // Constructor
    public Car(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.year = year;
    }
    // Method
    public void printCarInfo() {
        System.out.println(company);
        System.out.println(model);
        System.out.println(year);
    }   
    public static void main(String[] args){
        Car c = new Car("BMW", "G310R", 2024);
        c.printCarInfo();
    }
}

