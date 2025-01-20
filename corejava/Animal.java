public class Animal {
    void Animal(){
        System.out.println("Animal constructor");
    }
    void eat(){
        System.out.println("eating...");
    }
    public static String getclassification(){
        return "vertebrate";
    }
}
class Cat extends Animal {
    void Cat(){
        System.out.println("Cat constructor");
    }
    void eat(){
        super.eat();
        System.out.println("eating rat...");
    }
    
    
    void meow(){
        System.out.println("meowing...");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("barking...");
    }
}
