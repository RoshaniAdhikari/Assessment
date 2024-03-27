package assignment;

class Student {
    String name;
    int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
class Classroom {
    public String registerStudent(Student student) {
        if (!student.name.matches("[A-Z]+")) {
            return "Block letters needed";
        }

        if (student.score < 0 || student.score > 100) {
            return "Invalid score";
        }

        return "Registered";
    }
    public String studentCard(String card) {
        if (!card.matches("\\d+")) {
            return "Invalid card";
        }
        return "Card processed";
    }
}
public class MainClass {
    public static void main(String[] args) {
        Student s1 = new Student("A", 6);
        Classroom cm = new Classroom();
        String registrationStatus = cm.registerStudent(s1);
        System.out.println(registrationStatus);
    }
}
