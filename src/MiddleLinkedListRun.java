import depend.ListNode;
import run.MiddleLinkedList;

/**
 * @author yanglin
 * @date 2020/1/16
 */
public class MiddleLinkedListRun {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = listNode.setListNode(arr, listNode);
        MiddleLinkedList middleLinkedList = new MiddleLinkedList();
        ListNode listNode2 = middleLinkedList.middleNode(listNode1);
        System.out.println(middleLinkedList.middleNode(listNode1));
    }
}
