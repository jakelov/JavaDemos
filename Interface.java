interface Interface {
    public void printThis();
    public void printNum(int a);
}
class Drive implements Interface {
    public void printThis() {
        System.out.println("This is a print statement that is implemented by the class from the interface");
    }
    public void printNum(int num) {
        System.out.println(num);
    }
    public static void main(String[] arg)
    {
        Drive test = new Drive();
        test.printThis();
        test.printNum(100);
    }
}