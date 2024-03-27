package assignment;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class Abc {
    public static void main(String[] args) {
        int age = 22; // You can replace this with the actual age input
        try {
            checkAge(age);
            System.out.println("Valid");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) throws MyException {
        if (age < 15) {
            throw new MyException("Invalid: Age should be above 15");
        }
    }
}
