public class CalculatorApp {
    public static void main(String[] args){
        Caluculator c = new Caluculator();
        int a = c.add(3, 4);
        System.out.println(a);
        double b = c.add(10.23, 12.34);
        System.out.println(b);

    }
}
