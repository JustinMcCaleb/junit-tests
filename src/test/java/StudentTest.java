import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testCreateStudent() {
        Student judas = new Student(1L, "Judas");
        assertNotNull(judas);
    }

    @Test
    public void testStudentProperties() {
        Student priest = new Student(2L, "Priest");
        assertEquals(2L, priest.getId());
        assertSame("Priest", priest.getName());
        assertSame(0, priest.getGrades().size());
    }

    @Test
    public void testAddGradeMethod() {
        Student lucky = new Student(777, "Underlord");
        assertSame(0, lucky.getGrades().size());

        lucky.addGrade(100);
        assertSame(1, lucky.getGrades().size());
        assertSame(100, lucky.getGrades().get(0));

        lucky.addGrade(90);
        lucky.addGrade(99);
        assertSame(3, lucky.getGrades().size());
        assertSame(90, lucky.getGrades().get(1));
        assertSame(99, lucky.getGrades().get(2));
    }

    @Test
    public void testGradeAverageMethod() {
        Student lilith = new Student(777, "Lilith");

        lilith.addGrade(100);
        lilith.addGrade(50);
        lilith.addGrade(90);

        assertEquals(80.0, lilith.getGradeAverage(), 0);
    }
}
