import java.time.LocalDate;

public class Main {

    private int integer = 1;
    private String string = "str";

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void createLocalClass() {
        final LocalDate localDate = LocalDate.now();
        double d = 5.5;
        class LocalClass {

            public void method() {
                integer = 5;
                string = "str2";
//                localDate = LocalDate.of(2001, 1, 1);
//                d = 8.8;
                System.out.println(integer);
                System.out.println(string);
                System.out.println(localDate);
                System.out.println(d);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.method();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.createLocalClass();
    }
}
