public class Student {
    private String studentNumber;
    private String firstName;
    private String lastName;

    public Student(String studentNumber, String firstName, String lastName) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
