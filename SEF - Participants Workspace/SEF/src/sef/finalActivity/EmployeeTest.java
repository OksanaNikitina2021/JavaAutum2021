package sef.finalActivity;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

    private Employee employee;
    private String expectedText = "My name is %s and I am %s years old. I am working as %s in %s";

    protected void setUp() throws Exception {
        super.setUp();
        employee = new Employee();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testSetJobTitle() {
        String jobTitle = "Junior QA Engineer";
        employee.setJobTitle(jobTitle);

        assertEquals(jobTitle, employee.getJobTitle());
    }

    public void testSetCompanyName() {
        String companyName = "Citadele Banka";
        employee.setCompanyName(companyName);

        assertEquals(companyName, employee.getCompanyName());
    }

    public void testConstructorNameSalary() {
        String name = "Oksana Nikitina";
        double salary = 2500.00;
        employee = new Employee(name, salary);

        assertEquals(name, employee.getName());
        assertEquals(salary, employee.getSalary());
    }

    public void testIntroduction() {
        String name = "Oksana Nikitina";
        int age = 36;
        String jobTitle = "Junior QA Engineer";
        String companyName = "Citadele Banka";
        employee = new Employee(name, age, jobTitle, companyName, 0);

        assertEquals(String.format(expectedText, name, age, jobTitle, companyName), employee.introduce());
    }

}
