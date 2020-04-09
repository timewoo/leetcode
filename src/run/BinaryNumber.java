package run;

import depend.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yanglin
 * @date 2020/4/9 17:24
 */
public class BinaryNumber {

    public int getDecimalValue(ListNode head) {
        List<String> list = new ArrayList<>();
        list.add(String.valueOf(head.getVal()));
        ListNode next = head.next;
        while(next!=null){
            list.add(String.valueOf(next.getVal()));
            next = next.next;
        }
        return Integer.parseInt(list.stream().collect(Collectors.joining()),2);
    }
}
