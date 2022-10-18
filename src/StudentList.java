import java.util.ArrayList;

public class StudentList {

    public static ArrayList<Student> students;

    StudentList() {
        students = new ArrayList<>();
    }

    StudentList(StudentList studentList) {
        students = new ArrayList<>();
    }

    public static boolean add(Student student) {
        for (Student s : students) {
            if (s.getStudentId() == student.getStudentId()) {
                return false;
            }
        }
        students.add(student);
        return true;
    }

    public static boolean remove(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == student.getStudentId()) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }

    public static Student remove(int pos) {
        if (pos < 0 || pos >= students.size()) {
            return null;
        }
        return students.remove(pos);
    }

    public static Student get(int pos) {
        if (pos < 0 || pos >= students.size()) {
            return null;
        }
        return students.get(pos);
    }

    public static ArrayList<Integer> findLastname(String lastname) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getLastname().equals(lastname)) {
                arr.add(i);
            }
        }
        return arr;
    }

    public static ArrayList<Integer> findFirstname(String firstname) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFirstname().equals(firstname)) {
                arr.add(i);
            }
        }
        return arr;
    }
}






















