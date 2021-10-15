package sef.finalActivity;

import junit.framework.TestCase;

public class StudentsTest extends TestCase {

    private Students student;
    private String expectedText = "I am studying in university %s";

    protected void setUp() throws Exception {
        super.setUp();
        student = new Students();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testSetSchoolName() {
        String name = "Latvian University";
        student.setSchoolName(name);

        assertEquals(name, student.getSchoolName());
    }

    public void testConstructor() {
        student = new Students("Latvian University");

        assertEquals("Latvian University", student.getSchoolName());
    }

    public void testIntroduction() {
        student = new Students("Latvian University");
        assertEquals(String.format(expectedText, "Latvian University"), student.introduce());
    }
}
