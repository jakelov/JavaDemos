import java.util.Scanner;
public class Packages {
    // Packages can be user defined or built in
    // Generally used for data encapsulation and are named in reverse order of domain
    // Is used to group related classes, interfaces, subpackages into one big class or package.

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter any input: ");
        String var = kb.nextLine();
        System.out.println("You entered: " + var);
    }
}