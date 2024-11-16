import java.util.HashMap;
import java.util.Map;

public class Student {
    public String Name;
    public int Group;
    public int Course;
    public Map<String, Integer> GradesInSubjects;

    public Student(String name, int group, int course) {
        this.Name = name;
        this.Group = group;
        this.Course = course;
        this.GradesInSubjects = new HashMap<>();
    }

    public void addGrade(String subject, int grade) {
        GradesInSubjects.put(subject, grade);
    }
    public double getAverageScore() {
        if (GradesInSubjects.isEmpty()) {
            return 0.0;
        }

        return GradesInSubjects.values().stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    public void promoteToNextCourse() {
        Course++;
    }

    public int getCourse() {
        return Course;
    }

    public String getName() {
        return Name;
    }
}
