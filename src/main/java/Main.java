import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<MyInterface> implementations = Arrays.asList(
                () -> System.out.println("First implementation"),
                new MyInterface() {
                    @Override
                    public void doSomeStaff() {
                        System.out.println("Second implementation");
                    }
                },
                () -> System.out.println("Third implementation")
        );
        implementations.forEach(MyInterface::doSomeStaff);
        System.out.println();
        new MyAbstractClass(){

            {
                this.sayHello();
                this.doSomeStaff();
                this.sayGoodbye();
            }

            @Override
            public void doSomeStaff() {
                System.out.println("2 + 2 = " + (2 + 2));
            }
        };
    }
}
