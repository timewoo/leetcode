import depend.Book;

/**
 * @author yanglin
 * @date 2020/7/27 14:36
 */
public class GcTest {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // Proper cleanup:
        novel.checkIn();
        // Drop the reference, forget to clean up:
        new Book(true);
        // Force garbage collection & finalization:
        System.gc();
//        new Nap(1); // One second delay
    }
}
