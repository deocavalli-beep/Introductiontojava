
import java.util.ArrayList;

public class ArrayListLoop {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("JohnPaul");
        students.add("Chibumdum");
        students.add("Peter");
        students.add("Grace");
        students.add("David");

        int i = 0;

        System.out.println("LIST OF STUDENTS:");

        while (i < students.size()) {
            System.out.println(students.get(i));
            i++;
        }
    }
}
