import java.util.ArrayList;
import java.util.Date;

public class StudentList {

    //Fields
    public ArrayList<Student> students;

    //Constructors
    StudentList() {
        students = new ArrayList<>();
    }

    StudentList(StudentList studentList) {
        students = new ArrayList<>(studentList.students);
    }

    //Methods
    /**
     * adds the given student to the list,
     * if the list does not yet contain a student with the same studentId.
     * Returns true on success and false otherwise
     * @param student you want to add to the list
     * @return boolean
     */
    public final boolean add(Student student) {
        for (Student s : students) {
            if (s.getStudentId() == student.getStudentId()) {
                return false;
            }
        }
        students.add(student);
        return true;
    }

    /**
     * removes the student with the studentId of the given parameter.
     * Returns true if an entry was deleted and false otherwise.
     * @param student Student you want to remove
     * @return boolean
     */
    public final boolean remove(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == student.getStudentId()) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * removes the student at the given position from the list.
     * Returns the corresponding student if an entry was deleted
     * and null in case pos was too small/big
     * @param pos Integer as position you want to remove
     * @return Student who was removed or null if no one was removed
     */
    public final Student remove(int pos) {
        if (pos < 0 || pos >= students.size()) {
            return null;
        }
        return students.remove(pos);
    }

    /**
     * Returns the student at the position of the parameter
     * or null if pos is too big/small.
     * @param pos Integer as position of the student
     * @return Student or null
     */
    public final Student get(int pos) {
        if (pos < 0 || pos >= students.size()) {
            return null;
        }
        return students.get(pos);
    }

    /**
     * Returns a (possibly empty) list of positions,
     * corresponding to the students in the list
     * whose lastname matches the parameter.
     * @param lastname The lastname you are searching for
     * @return ArrayList<Integer> with the positions
     */
    public final ArrayList<Integer> findLastname(String lastname) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getLastname().equals(lastname)) {
                arr.add(i);
            }
        }
        return arr;
    }

    /**
     * Returns a (possibly empty) list of positions,
     * corresponding to the students in the list
     * whose firstname matches the parameter.
     * @param firstname The firstname you are searching for
     * @return ArrayList<Integer> with the positions
     */
    public final ArrayList<Integer> findFirstname(String firstname) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFirstname().equals(firstname)) {
                arr.add(i);
            }
        }
        return arr;
    }

    /**
     * Should the list contain students with the age,
     * return all positions of the student's in the list,
     * else return an empty list.
     * @param age The age from the student you search for
     * @return int[] Array with positions of the students with the same age
     */
    public final ArrayList<Integer> findStudentsByAge(int age) {
        ArrayList<Integer> ageList = new ArrayList<>();
        Date now = new Date();
        int nowMonth = now.getMonth() + 1;                              //Returns Month values from 0 to 11, adding 1, so we get values from 1 to 12
        int nowYear = now.getYear() + 1900;                             //Returns Year - 1900, so adding 1900 to get the actual year
        for (int i = 0; i < students.size(); i++) {                     //Looping threw the whole list
            int year = students.get(i).getBirthday().getYear() + 1900;  //Getting year the student was born
            int month = students.get(i).getBirthday().getMonth();       //Getting the Month the student was born
            int result = nowYear - year;                                //Interim result for the age
            if (month < nowMonth) {                                     //Birthday not yet this year
                result--;                                               //Decrement the age because the student will get older this year
            }
            else if (month == nowMonth) {                               //The student's birthday is in the current month
                int nowDay = now.getDate();                             //Now we have to check the Day
                int day = students.get(i).getBirthday().getDate();      //Get the students Birthday
                if (day > nowDay) {                                     //if the day is to come
                    result--;                                           //Increment the result because he is getting older this month
                }
            }
            if (result == age) {                                        //Compare the calculated age and the given age
                ageList.add(i);                                         //Adding the index to the list
            }
        }
        return ageList;
    }

    /**
     * Return the number of students inside the list.
     * @return int
     */
    public final int size() {
        return students.size();
    }

    /**
     * Returns true if the list contains the student with the studentId.
     * Otherwise, returns false.
     * @param studentId what is searched for
     * @return boolean
     */
    private boolean containsId(final long studentId) {
        for (Student s : students) {
            if (s.getStudentId() == studentId) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String str = "";
        for (Student s : students) {
            str += s.toString() + "\n";
        }
        return str;
    }
}






















