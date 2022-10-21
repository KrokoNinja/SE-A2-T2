import java.util.Date;

public class Student {
    //Fields
    private String firstname;
    private String lastname;
    private long studentId;
    private double weight;
    private Date birthday;

    private enum SortKey {FIRSTNAME, LASTNAME, STUDENT_ID, WEIGHT, BIRTHDAY}

    //Constructors
    Student() {
        this(null, null, 0, 0, new Date(0));
    }

    Student(String firstname, String lastname, long studentId, double weight, Date birthday) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentId = studentId;
        this.weight = weight;
        this.birthday = birthday;
    }

    //Getters and Setters

    public final String getFirstname() {
        return firstname;
    }

    public final void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public final String getLastname() {
        return lastname;
    }

    public final void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public final String getName() {
        return firstname + " " + lastname;
    }

    public final long getStudentId() {
        return studentId;
    }

    private void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public final double getWeight() {
        return weight;
    }

    public final void setWeight(double weight) {
        this.weight = weight;
    }

    public final Date getBirthday() {
        return birthday;
    }

    public final void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}