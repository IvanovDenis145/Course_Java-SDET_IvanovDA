import java.util.ArrayList;
import java.util.List;

public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();

    Student student1 = new Student("Алексей", 101, 1);
    student1.addGrade("Математика", 5);
    student1.addGrade("Физика", 4);
    student1.addGrade("Химия", 5);

    Student student2 = new Student("Матвей", 101, 1);
    student2.addGrade("Математика", 3);
    student2.addGrade("Физика", 2);
    student2.addGrade("Химия", 2);

    Student student3 = new Student("Мария", 101, 1);
    student3.addGrade("Математика", 4);
    student3.addGrade("Физика", 4);
    student3.addGrade("Химия", 4);

    students.add(student1);
    students.add(student2);
    students.add(student3);

    processStudents(students);

    printStudents(students, 2);
}
public static void processStudents(List<Student> students) {
    students.removeIf(student -> student.getAverageScore() < 3);
    students.forEach(student -> {
        if (student.getAverageScore() >= 3) {
            student.promoteToNextCourse();
        }
    });
}

public static void printStudents(List<Student> students, int course) {
    students.stream()
            .filter(student -> student.getCourse() == course)
            .map(Student::getName)
            .forEach(System.out::println);
}
