package sef.module3.activity;

/**
 * @author
 */
public class OperatorActivity {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Declare numbers to be operated
        int i = 8;
        int j = 5;

        // Subtract numbers
        int result = i - j;

        // Print result
        System.out.println("Difference = " + result);

        // Add numbers
        int addition = i + j;

        // Print result
        System.out.println("Addition result is " + addition);

        //Multiply numbers
        int multiplication = i * j;
        System.out.println("Multiplication result is " + multiplication);

        //Divide numbers
        int division = i / j;
        System.out.println("Division result is " + division);

        //Modulo
        int modulo = i %j;
        System.out.println("Modulo " + modulo);

    }
}
