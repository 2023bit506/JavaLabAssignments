//static inner class or static nested classes.

public class nestedClasses1 {

    static int a = 10;
    int b = 20;

    public static void display() {
        System.out.println(a);
    }

    static class Inner {
        Inner()
        {
            System.out.println("Inner class constructor");
            System.out.println(a);
            display();
            // System.out.println(b); //error: non-static variable b cannot be referenced from a static context
        }
        
    }

    public static void main(String[] args) {
        System.out.println(nestedClasses1.a);
        nestedClasses1.display();

        nestedClasses1.Inner obj1 = new nestedClasses1.Inner();
    }

}
