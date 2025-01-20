public class AnimalApp {
     public static void main(String[] args){
        Cat c = new Cat();
        short s = 10;
        int i = 32768;
        int i2 = s;
        short s2 = (short)i;
        System.out.println(s2);
       /* c.meow();
        c.eat();
        Dog d = new Dog();
        d.bark();
        d.eat();
        System.out.println(Animal.getclassification());
        Animal a = new Dog(); 
        a.eat();
        Dog d1 = (Dog) a;
        Animal a1 = new Animal(); */
      //  Dog d2 = (Dog)a1;//sub class cannot reffer to spr class , it ll throw run time exception//
    }
}