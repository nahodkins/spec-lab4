public class Main {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.getNestedClass().printMyClassVariables();

        MyClass.MyStaticInnerClass myStaticInnerClass = new MyClass.MyStaticInnerClass();
        myStaticInnerClass.printMyClassVariables();
    }
}
