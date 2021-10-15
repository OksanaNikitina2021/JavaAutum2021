package sef.finalActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;
    private String expectedText = "My name is %s and I am %s years old.";

    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testSetName() throws Exception {
        String name = "Oksana Nikitina";
        person.setName(name);

        assertEquals(name, person.getName());
    }

    //added this test to see that correct error message has been returned
    public void testSetNameDigits() throws Exception {
        String name = "Ok3sana Nikit4ina";
        person.setName(name);

        assertEquals(name, person.getName());
    }

    public void testSetAge() throws Exception {
        int age = 36;
        person.setAge(age);

        assertEquals(age, person.getAge());
    }

    public void testConstructor() {
        String name = "Oksana Nikitina";
        int age = 36;
        person = new Person(name, age);

        assertEquals(name, person.getName());
        assertEquals(age, person.getAge());
    }

    public void testIntroduction() {
        person = new Person("Oksana Nikitina", 36);
        assertEquals(String.format(expectedText, "Oksana Nikitina", 36), person.introduce());
    }

}
