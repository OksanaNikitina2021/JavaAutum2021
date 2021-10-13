package sef.module7.sample;

public class PersonSampleTwo {

    private String name;
    private int age;
    private String gender;
    private final String eyeColor = "blue";

    public PersonSampleTwo(String name, int age) {
        setName(name);
        setAge(age);
    }

    public PersonSampleTwo(String name, int age, String gender) {
        setGender(gender);
        setName(name);
        setAge(age);
    }

    public final void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public final void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        if (gender.equals("male") || gender.equals("female")) {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Gender should be male or female");
        }
    }

    public String getEyeColor() {
        return this.eyeColor;
    }
}
