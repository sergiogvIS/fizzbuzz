package es.ulpgc.fizzbuzz;

public class Fizzbuzz {
    public Fizzbuzz(){

    }

    public String get(int i) {
        if(isMultipleOfThree(i)) return "Fizz";
        if(isMultipleOfFive(i)) return "Buzz";
        return Integer.toString(i);
    }

    private boolean isMultipleOfFive(int i) {
        return i % 5 == 0;
    }

    private boolean isMultipleOfThree(int i) {
        return i % 3 == 0;
    }
}
