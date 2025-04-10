public class TestProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to NEU Library!");
        System.out.println("--------------------------------");
        Student student1 = new Student("23-11842-344", "Alyssa Mae", "San Pedro");
        Student student2 = new Student("22-12345-678", "Juan", "Dela Cruz");

        Borrowable book = new Book();
        Borrowable journal = new Journal();

        ResourceBorrower resourceBorrower = new ResourceBorrower();

        resourceBorrower.borrowResource(student1, book, "Introduction to Algorithms");
        resourceBorrower.borrowResource(student2, journal, "Nature Neuroscience Vol. 29");
        resourceBorrower.borrowResource(student1, book, "Data Structures and Algorithms");
        resourceBorrower.borrowResource(student2, journal, "The Lancet - Medical Journal");
        resourceBorrower.borrowResource(student1, book, "Introduction to Algorithms");
    }
}
