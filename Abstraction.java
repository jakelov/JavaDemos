//Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
//Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
public class Abstraction {
    // Since animal is an abstract class, we cannot make an OBJECT of animal, but can create objects that extend or inherit it.
    //Animal myPet = new Animal(); // generates an error, cannot create an object because it's an abstract class.
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.sleep();
    }
}
    abstract class Animal {
        public abstract void makeSound();
        public void sleep() {
            System.out.println("Zzzzzzzz");
        }
    }
    class Dog extends Animal {
        public void makeSound() {
            System.out.println("WOOF WOOF");
        }
    }
    
