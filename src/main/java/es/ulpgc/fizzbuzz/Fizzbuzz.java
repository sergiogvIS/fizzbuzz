package es.ulpgc.fizzbuzz;

public class Fizzbuzz {
    public Fizzbuzz(){

    }

    public String get(int i) {
        return fizzbuzz(i).isEmpty() ? Integer.toString(i) : fizzbuzz(i);
    }

    private String fizzbuzz(int i) {
        return fizz(i) + buzz(i);
    }

    private String fizz(int i) {
        return isMultipleOfThree(i) ? "Fizz" : "";
    }

    private String buzz(int i) {
        return isMultipleOfFive(i) ? "Buzz" : "";
    }

    private boolean isMultipleOfFive(int i) {
        return i % 5 == 0;
    }

    private boolean isMultipleOfThree(int i) {
        return i % 3 == 0;
    }
}
