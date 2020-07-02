import java.util.ArrayList;
import java.util.List;

public class Student {

    private long id;
    private String name;
    private List<Integer> grades;

//    public Student(){}

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        grades = new ArrayList<>();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(int i) {
        this.grades.add(i);
    }

    public int getGradeAverage() {
        int num = 0;
        for (Integer grade : grades) {
            num += grade;
        }
        return num / grades.size();
    }
}
