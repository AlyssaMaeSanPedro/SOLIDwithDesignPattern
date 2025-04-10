public class Book implements Borrowable{

    @Override
    public void borrow(String title) {
        System.out.println("Borrowing Book: " + title);
    }
}