//1.static nested class.
//2.non-static nested class(inner-class).

public class practiceNestedClass {
    static int a = 10;
    static String a1 = "Shubham";
    static int b = 20;
    static String b1 = "Satara";
    static int c = 30;
    static String c1 = "Happy";
    static private int d = 454;

    public static void display()
    {
        System.out.println("************************Data In Display Method*******************");
        System.out.println(a);
        System.out.println(a1);
        System.out.println(d);

    }
    static class Inner2{
        Inner2()
        {
            System.out.println("************************Data In Inner2 Constructor*******************");
            System.out.println(b);
            System.out.println(b1);
            display();
        }
    }
    public static void main(String[] args) {
        System.out.println("************************Data In Main Method*******************");
        System.out.println(practiceNestedClass.c);
        System.out.println(practiceNestedClass.c1);

        practiceNestedClass.Inner2 obj = new practiceNestedClass.Inner2();
        System.out.println(obj);
    }
}
