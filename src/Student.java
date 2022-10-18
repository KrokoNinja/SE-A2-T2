import java.util.Date;

public class Student {
    String firstname;
    String lastname;
    long studentId;
    double weight;
    Date birthday;

    public enum SortKey {FIRSTNAME, LASTNAME, STUDENT_ID, WEIGHT, BIRTHDAY}
}
