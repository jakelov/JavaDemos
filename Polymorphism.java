// Classes shown to represent basic polymorphism
// Example is a modified verison from the w3schools.
public class Polymorphism { 
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();
    }
}
class Animal {
    public void makeSound() {
    System.out.println("A sound has been made");
    }
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog says: woof woof");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat says: meow");
    }
}

