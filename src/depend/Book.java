package depend;

/**
 * @author yanglin
 * @date 2020/7/27 14:35
 */
public class Book {

    boolean checkedOut = false;

    public Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    public void checkIn() {
        checkedOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if (checkedOut) {
            System.out.println("Error: checked out");
        }
        // Normally, you'll also do this:
        // super.finalize(); // Call the base-class version
    }
}
