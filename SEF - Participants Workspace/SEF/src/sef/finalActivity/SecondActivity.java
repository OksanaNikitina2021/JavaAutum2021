package sef.finalActivity;

public class SecondActivity {

    public static void main(String[] args) {

        Calculator calculator = new Calculator("Casio");

        double addition = calculator.add(10.0, 15.0);
        System.out.println(addition);

        double subtraction = calculator.subtract(30, 8);
        System.out.println(subtraction);

        double multiplication = calculator.multiply(9, 4);
        System.out.println(multiplication);

        double division = calculator.divide(30, 5);
        System.out.println(division);

    }

}
