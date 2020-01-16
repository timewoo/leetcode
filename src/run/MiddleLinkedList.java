package run;

import depend.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yanglin
 * @date 2020/1/16
 */
public class MiddleLinkedList {

    public ListNode middleNode(ListNode head) {
        if(head==null){
            return null;
        }
        List<ListNode> list = new ArrayList<>();
        list.add(head);
        List<ListNode> list1 = cycle(head.next,list);
        return list1.get(list1.size()/2);
    }

    public static List<ListNode> cycle(ListNode child,List<ListNode> list){
        if(child==null){
            return list;
        }
        list.add(child);
        if(child.next==null){
            return list;
        }
        return cycle(child.next,list);
    }
}
