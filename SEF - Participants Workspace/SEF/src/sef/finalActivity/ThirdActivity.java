package sef.finalActivity;

public class ThirdActivity {

    public static void main(String[] args) throws Exception {
        Person employee = new Employee();
        try {
            employee.setAge(13);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Calculator calc = new Calculator("Casio");
        try{
            calc.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        Employee emp = new Employee();
        try{
            emp.setSalary(-1500.00);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
