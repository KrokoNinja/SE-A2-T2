import java.util.ArrayList;

public class StudentList {

    //Fields
    public static ArrayList<Student> students;

    //Constructors
    StudentList() {
        students = new ArrayList<>();
    }

    StudentList(StudentList studentList) {
        students = new ArrayList<>();
    }

    //Methods
    /**
     * adds the given student to the list,
     * if the list does not yet contain a student with the same studentId.
     * Returns true on success and false otherwise
     * @param student you want to add to the list
     * @return boolean
     */
    public static boolean add(Student student) {
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
    public static boolean remove(Student student) {
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
    public static Student remove(int pos) {
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
    public static Student get(int pos) {
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
    public static ArrayList<Integer> findLastname(String lastname) {
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
    public static ArrayList<Integer> findFirstname(String firstname) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFirstname().equals(firstname)) {
                arr.add(i);
            }
        }
        return arr;
    }

    //!TODO implement findStudentsByAge method

    /**
     * Should the list contain students with the age,
     * return all positions of the students int the list,
     * else return an empty list.
     * @param age The age from the student you search for
     * @return int[] Array with positions of the students with the same age
     */
    public static int[] findStudentsByAge(int age) {
        return new int[]{4};
    }
    //!TODO

    /**
     * Return the number of students inside the list.
     * @return int
     */
    public static int size() {
        return students.size();
    }

    /**
     * Returns true if the list contains the student with the studentId.
     * Otherwise, returns false.
     * @param studentId what is searched for
     * @return boolean
     */
    private static boolean containsId(final long studentId) {
        for (Student s : students) {
            if (s.getStudentId() == studentId) {
                return true;
            }
        }
        return false;
    }
}






















