public class Main {

    public static void main(String[] args) {
        Person adam = new Person("Adam", 20, true);
        Person john = new Person("John", 13, false);

        System.out.println(adam);
        System.out.println(john);

        adam.setAge(21);
        System.out.println("Adam's age: " + adam.getAge());
    }
}
