package sef.finalActivity;

public class Employee extends Person {

    private String jobTitle;
    private String companyName;
    private double salary;

    public Employee(){
    }

    public Employee(String name, int age) {
        super(name, age);
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public Employee(String name, int age, String jobTitle, String companyName, double salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws Exception {
        if(salary < 0){
            throw new Exception("The salary value could not be negative.");
        }
        this.salary = salary;
    }

    public String introduce() {
        return "My name is " + getName() + " and I am " + getAge() + " years old. I am working as "
                + jobTitle + " in " + companyName;
    }

    public int compare(Employee emp1, Employee emp2) {
        return (int) (emp2.salary - emp1.salary);
    }
}
