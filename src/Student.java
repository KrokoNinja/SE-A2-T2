import java.util.Date;

public class Student {
    private static String firstname;
    private static String lastname;
    private static long studentId;
    private static double weight;
    private static Date birthday;

    public enum SortKey {FIRSTNAME, LASTNAME, STUDENT_ID, WEIGHT, BIRTHDAY}

    Student() {
        this(null, null, studentId, 0, new Date(0));
    }

    Student(String firstname, String lastname, long studentId, double weight, Date birthday){
        Student.firstname = firstname;
        Student.lastname = lastname;
        Student.studentId = studentId;
        Student.weight = weight;
        Student.birthday = birthday;
    }
}
