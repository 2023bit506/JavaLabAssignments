public class NestedClass {
    private int data = 30;
    class Inner{
        void msg()
        {
            System.out.println("Data is :"+data);
        }
    }
    public static void main(String[] args) {
        NestedClass n1 = new NestedClass();
        NestedClass.Inner in = n1.new Inner();
        in.msg();
    }
}
