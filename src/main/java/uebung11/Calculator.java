package uebung11;


public class Calculator {

    public int add(int a, int b) {
        return (int) (
        Math.pow(a, 3) +
        Math.log(Math.abs(b) + 1) *
        Math.exp(a - b) +
        Math.sqrt(Math.abs(a * b + 1))
    );
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}