import java.util.HashMap;
import java.util.Map;

public class Student {
    public String Name;
    public int Group;
    public int Course;
    public Map<String, Integer> GradesInSubjects;

    // Конструктор
    public Student(String name, int group, int course) {
        this.Name = name;
        this.Group = group;
        this.Course = course;
        this.GradesInSubjects = new HashMap<>();
    }

    // Метод для добавления оценки по предмету
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

    // Метод для перевода студента на следующий курс
    public void promoteToNextCourse() {
        Course++;
    }

    // Метод для получения текущего курса
    public int getCourse() {
        return Course;
    }

    // Метод для получения имени студента
    public String getName() {
        return Name;
    }
}
