import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CohortTest {

    private Cohort ganymede;
    Student studentOne;
    Student studentTwo;
    Student studentThree;

    @Before
    public void setUp() {
        ganymede = new Cohort();
        studentOne = new Student(7L, "White Buffalo");
        studentTwo = new Student(8L, "Casper Allen");
        studentThree = new Student(9L, "Dylan LeBlanc");
    }

    @Test
    public void getCohortAverage() {
        ganymede.addStudent(studentOne);
        studentOne.addGrade(100);
        ganymede.addStudent(studentTwo);
        studentTwo.addGrade(99);
        ganymede.addStudent(studentThree);
        studentThree.addGrade(94);

        assertEquals(97.6, ganymede.getCohortAverage(),.1);

    }

    @Test
    public void addStudent() {
        //Checking size of students List
        assertEquals(0, ganymede.getStudents().size());

        ganymede.addStudent(studentOne);
        assertEquals(1, ganymede.getStudents().size());

        ganymede.addStudent(studentTwo);
        ganymede.addStudent(studentThree);
        assertEquals(3, ganymede.getStudents().size());

        //checking specific values at index
        assertEquals("White Buffalo", ganymede.getStudents().get(0).getName());
        assertEquals("Casper Allen", ganymede.getStudents().get(1).getName());
        assertEquals("Dylan LeBlanc", ganymede.getStudents().get(2).getName());
    }

    @Test
    public void getStudents() {
        //Adding students
        ganymede.addStudent(studentOne);
        ganymede.addStudent(studentTwo);
        ganymede.addStudent(studentThree);

        //Testing size of list
        assertEquals(3, ganymede.getStudents().size());

        //Testing student object names match specific index
        assertEquals(studentOne.getName(), ganymede.getStudents().get(0).getName());
        assertEquals(studentTwo.getName(), ganymede.getStudents().get(1).getName());
        assertEquals(studentThree.getName(), ganymede.getStudents().get(2).getName());
    }
}