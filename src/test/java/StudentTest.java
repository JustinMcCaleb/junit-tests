import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    Student student1 = new Student(666, "Bowser");

    @Before
    public void setup() {
        student1.setId(666);
        student1.setName("Bowser");
        student1.addGrade(90);
    }

    @Test
    public void testHasProperties() {
        //ID Property
        assertEquals(666, student1.getId());


        //Name Property
        assertEquals("Bowser", student1.getName());
    }

    @Test
    public void testStudentConstructor() {
        Student student2 = new Student(1, "bob");
        assertEquals(1, student2.getId());
        assertEquals("bob", student2.getName());
    }

    @Test
    public void testAddGrade() {
        assertEquals(1, student1.getGrades().size());
        student1.addGrade(97);
        student1.addGrade(99);
        assertEquals(3, student1.getGrades().size());
    }

    @Test
    public void testGradeAverage() {
        student1.addGrade(100);
        student1.addGrade(78);
        assertEquals(89, student1.getGradeAverage(), 1);
    }


}
