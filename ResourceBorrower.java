public class ResourceBorrower {
    public void borrowResource(Student student, Borrowable borrowable, String title) {
        System.out.println("Student Name: " + student.getFullName());
        System.out.println("Student No: " + student.getStudentNumber());
        borrowable.borrow(title);
        System.out.println();
    }
}
