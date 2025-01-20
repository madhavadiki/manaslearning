public class BitsApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee("manas", 7416, 30000.34);
        Employee emp2 = new Employee("madhav", 2222, 35000.00);
        Employee emp3 = new Employee("hare", 3333, 20000.00);
        Employee emp4 = new Employee("krishna", 4444, 10000.00);
        emp1.displayEmployee();
        emp2.displayEmployee();

        Employee.printCostPerMonth();
    }
}
