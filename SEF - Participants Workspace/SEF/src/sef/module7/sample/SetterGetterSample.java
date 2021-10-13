package sef.module7.sample;

public class SetterGetterSample {

    public static void main(String arg[]) {

        //With exposed implementation, an object can have values passed to it
        //that may be contrary to it's design

        PersonSampleOne p1 = new PersonSampleOne();
        p1.name = null;
        p1.age = -1000;

        //Will not allow improper fields to be set by throwing an exception
        PersonSampleTwo p2 = new PersonSampleTwo("John Doe", 10);

        PersonSampleTwo p3 = new PersonSampleTwo("Oksana Nikitina", 36, "female");
        System.out.println("---- Person info ---");
        System.out.println("Name: " + p3.getName());
        System.out.println("Age: " + p3.getAge());
        System.out.println("Gender: " + p3.getGender());
    }
}
