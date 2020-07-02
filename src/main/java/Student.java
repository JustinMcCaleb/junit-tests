import java.util.ArrayList;

public class Student {


    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int i) {
        grades.add(i);
    }

    public double getGradeAverage() {
        double num = 0;
        for(int grade : grades) {
            num += grade;
        }
        return num / grades.size();
    }
}