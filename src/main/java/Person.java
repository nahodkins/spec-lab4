public class Person {

    private static final String PERSON_GREETING_TEMPLATE = "Hello, my name is %s. I am %d.";
    private static final String IF_MARRIED_GREETING = "I am married =)";

    private String name;
    private int age;
    private boolean isMarried;

    public Person(String name, int age, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public String toString() {
        String message = String.format(PERSON_GREETING_TEMPLATE, name, age);
        if (isMarried) {
            message += IF_MARRIED_GREETING;
        }
        return message;
    }
}
