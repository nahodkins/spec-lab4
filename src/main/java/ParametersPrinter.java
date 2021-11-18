import java.lang.reflect.InaccessibleObjectException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParametersPrinter {

    private static final String FIELD_STRING_REPRESENTATION_TEMPLATE = "%s %s";

    private int integer;
    private String string;

    private List<String> getFields(Class<?> clazz) {
        return Arrays.stream(clazz.getDeclaredFields())
                .peek(field -> {
                    try {
                        field.setAccessible(true);
                    } catch (InaccessibleObjectException ignored) {
                    }
                })
                .map(field -> String
                        .format(FIELD_STRING_REPRESENTATION_TEMPLATE, field.getType().getSimpleName(),
                                field.getName()))
                .collect(Collectors.toList());
    }

    private void printParameterInfo(Object object) {
        Class<?> objectClass = object.getClass();
        System.out.println("Parameter type: " + objectClass.getSimpleName());
        System.out.println("Parameter fields: " + getFields(objectClass));
    }

    public void getFiveParametersInfo(String s, Integer integer, Main main, MyClass myClass, ParametersPrinter printer) {
        printParameterInfo(s);
        System.out.println();
        printParameterInfo(integer);
        System.out.println();
        printParameterInfo(main);
        System.out.println();
        printParameterInfo(myClass);
        System.out.println();
        printParameterInfo(printer);
        System.out.println();
    }

    public void getFiveParametersInfo(Object[] objects) {
        for (Object object : objects) {
            printParameterInfo(object);
            System.out.println();
        }
    }

    public void getFiveParametersInfoVarArgs(Object... objects) {
        for (Object object : objects) {
            printParameterInfo(object);
            System.out.println();
        }
    }
}
