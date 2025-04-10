public class Journal implements Borrowable{

    @Override
    public void borrow(String title) {
        System.out.println("Borrowing Journal: " + title);
    }
}