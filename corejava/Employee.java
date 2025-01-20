public class Employee {
    String name;
    int id;
    double salary;
    static double costPerMonth;

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
        costPerMonth = costPerMonth + salary;
    }
    public void displayEmployee(){
        System.out.println("---------------\n" + name);
        System.out.println(id);
        System.out.println(salary);
        System.out.println(getAnnualSalary());
    }
    public double getAnnualSalary(){
        return salary*12;
    }

    public static void printCostPerMonth(){
        System.out.println("Cost per month:" + costPerMonth);
    }
}
