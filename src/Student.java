import java.util.Date;

public class Student {
    //Fields
    private static String firstname;
    private static String lastname;
    private static long studentId;
    private static double weight;
    private static Date birthday;

    public enum SortKey {FIRSTNAME, LASTNAME, STUDENT_ID, WEIGHT, BIRTHDAY}

    //Constructors
    Student() {
        this(null, null, studentId, 0, new Date(0));
    }

    Student(String firstname, String lastname, long studentId, double weight, Date birthday) {
        Student.firstname = firstname;
        Student.lastname = lastname;
        Student.studentId = studentId;
        Student.weight = weight;
        Student.birthday = birthday;
    }

    //Getters and Setters

    public String getFirstname() {
        return firstname;
    }

    public static void setFirstname(String firstname) {
        Student.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public static void setLastname(String lastname) {
        Student.lastname = lastname;
    }

    public String getName() {
        return firstname + " " + lastname;
    }

    public long getStudentId() {
        return studentId;
    }

    public double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Student.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public static void setBirthday(Date birthday) {
        Student.birthday = birthday;
    }
}
