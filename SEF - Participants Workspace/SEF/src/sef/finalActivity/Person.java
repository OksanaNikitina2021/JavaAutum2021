package sef.finalActivity;

public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        try {
            checkForNumbers(name);
        } catch (Exception e) {
            throw e;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age < 18){
            throw new Exception("Employee age should be equal to 18 or greater");
        }
        this.age = age;
    }

    public String introduce() {
        return "My name is " + name + " and I am " + age + " years old.";
    }

    private void checkForNumbers(String name) throws Exception {
        for(char c : name.toCharArray()){
            if(Character.isDigit(c)){
                throw new Exception("Digits are not allowed!");
            }
        }
    }
}

