class Animal{
    void eat() {
        System.out.println("the animal eats");
    }
}
class Dog extends Animal{
    void sleep() {
        System.out.println("the dog sleeps");//sleep()+eat()
    }
}

class BabyDog extends Dog{
    void bark() {
        System.out.println("the baby dog barks");//bark() eat() sleep()
    }
}

public class MulInh {
    public static void main(String[] args) {
BabyDog bd=new BabyDog();
bd.sleep();
bd.bark();
bd.eat();
        
    }

}
