package assignment;

class Stud {
    String name;
    int score;
    public Stud(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
class Clroom {
    public String registerStudent(Stud student) {
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
public class Source1 {
    public static void main(String[] args) {
        Stud s1 = new Stud("abc", 60);
        Clroom cm = new Clroom();
        String registrationStatus = cm.registerStudent(s1);
        System.out.println(registrationStatus);
    }
}
