package assignment;

class Studentt {
    String name;
    int score;
    public Studentt(String name, int score) {
        this.name = name;
        this.score = score;
    }}
class Classroomm {
    public String registerStudent(Studentt student) {
    	
        if (!student.name.equals(student.name.toUpperCase())) {
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
        else
        {
        return "Valid card";
        }}}
public class Main {
    public static void main(String[] args) {
        // Sample Input
        Studentt s1 = new Studentt("A", 6);
        Classroomm cm = new Classroomm();
        String result = cm.registerStudent(s1);

        // Sample Output
        System.out.println(result);  // Output: Registered
    }
}

