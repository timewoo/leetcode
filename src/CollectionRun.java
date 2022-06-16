import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author yanglin
 * @date 2020/8/21 16:24
 */
public class CollectionRun {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10000000);
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        long now = System.currentTimeMillis();
        list.add(10000000,100001);
        System.out.println(System.currentTimeMillis()-now);
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10000000; i++) {
            linkedList.add(i);
        }
        long now1 = System.currentTimeMillis();
        linkedList.add(10000000,100001);
        System.out.println(System.currentTimeMillis()-now1);
    }
}
