public class Main {

    public static void main(String[] args) {
        int b = 4;
        ParametersPrinter printer = new ParametersPrinter();
        System.out.println("\t5 method arguments:");
        printer.getFiveParametersInfo("s", 1, new Main(), new MyClass(), new ParametersPrinter());
        System.out.println("\tObject array:");
        printer.getFiveParametersInfo(new Object[]{"s", 1, new Main(), new MyClass(), new ParametersPrinter()});
        System.out.println("\tVarargs:");
        printer.getFiveParametersInfoVarArgs("s", 1, new Main(), new MyClass(), new ParametersPrinter(), b);
    }
}
