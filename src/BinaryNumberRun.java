import depend.ListNode;
import run.BinaryNumber;

/**
 * @author yanglin
 * @date 2020/4/9 17:25
 */
public class BinaryNumberRun {

    public static void main(String[] args) {
        int[] array = {1,0,1};
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = listNode.setListNode(array, listNode);
        BinaryNumber binaryNumber = new BinaryNumber();
        System.out.println(binaryNumber.getDecimalValue(listNode1));
    }
}
