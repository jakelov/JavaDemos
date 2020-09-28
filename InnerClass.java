public class InnerClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
      }
}
class OuterClass {
  int x = 100;

  class InnerClass {
    int y = -50;
  }
}