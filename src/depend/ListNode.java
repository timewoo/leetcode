package depend;

import java.util.Arrays;

/**
 * @author yanglin
 * @date 2020/1/16
 */
public class ListNode {

    int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public int getVal(){
        return val;
    }

    public void setVal(int val){
        this.val = val;
    }

    public ListNode getNext(){
        return next;
    }

    public void setNext(ListNode next){
        this.next = next;
    }

    public ListNode setListNode(int[] arr,ListNode node){
        if (arr.length==0){
            return node;
        }
        ListNode listNode = new ListNode(arr[0]);
        if (node==null){
            node = listNode;
        }else {
            node.setNext(setListNode(Arrays.copyOfRange(arr,1,arr.length),listNode));
        }
        return node;
    }
}
