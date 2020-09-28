public class Encapsulation {
    public int varA = 1;
    private int varB = 0;
    protected int varC = 5;
    public int getVarB() {
        return this.varB;
    }
    public void setVarB(int b)
    {
        this.varB = b;
    }
    public int getVarC() {
        return this.varC;
    }
    public void setVarC(int c)
    {
        this.varC = c;
    }
}
    class Driver {
    public static void main(String[] args) {
        Encapsulation cap = new Encapsulation();
        System.out.println("A: " + cap.varA);
        //System.out.println(cap.varB); // gives complimation error. Main does not have access to this variable. We must use a getter.
        System.out.println("B: " + cap.getVarB());
        System.out.println("C: " + cap.varC);
    }
}
