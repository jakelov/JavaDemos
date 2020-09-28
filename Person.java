import java.util.Scanner;
// Made to demostrate the differences between a class and an object in Java.
// A class is essentially a type, that can have fields like name, height, etc.
// An object is an INSTANCE of this type, essentially a named object of class. You can create infinite objects.
// We could make hundreds of millions of "Persons", and each one is an object of type Person, and each object "should" have these fields initialized, so they would all share common characteristics. 
public class Person { // the class or TYPE of Person.
    int height;
    int weight;
    String name;
    int age;
    public static void main (String[] args)
    {
        Person you = new Person(); // Creates an OBJECT that is of the TYPE Person.
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a name: ");
        you.name = kb.nextLine();
        System.out.println("Enter age: ");
        you.age = kb.nextInt();
        System.out.println("Enter height in cm: ");
        you.height = kb.nextInt();
        System.out.println("Enter weight in lbs: ");
        you.weight = kb.nextInt();
        System.out.println("You are " + you.name + " and are " + you.age + " years old and are " + you.height + " cm tall and weigh " + you.weight + " lbs");
        return;
    }
}
