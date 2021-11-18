import java.time.LocalDate;

public class MyClass {

    private int integer = 1;
    private String string = "str";
    private static LocalDate localDate = LocalDate.now();
    private MyNestedClass nestedClass = new MyNestedClass();

    public MyNestedClass getNestedClass() {
        return nestedClass;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public static void sayHelloStatic() {
        System.out.println("Hello static");
    }

    public class MyNestedClass {
        private int integer;

        public void printMyClassVariables() {
            System.out.println("MyClass integer: " + MyClass.this.integer);
            System.out.println("MyNestedClass integer: " + integer);
            System.out.println("String: " + string);
            System.out.println("LocalDate: " + localDate);

            sayHello();
            sayHelloStatic();
        }
    }

    public static class MyStaticInnerClass {

        public void printMyClassVariables() {
//            System.out.println(integer);
//            System.out.println("MyNestedClass integer: " + MyClass.this.integer);
//            System.out.println("String: " + string);
            System.out.println("LocalDate: " + localDate);

//            sayHello();
            sayHelloStatic();
        }
    }
}
