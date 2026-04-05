/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node dummy = new Node(0);
        Node l1 = dummy;
        Node l2 = head;
        while(l2 != null){
            Node newNode = new Node(l2.val);
            map.put(l2, newNode);
            l1.next = newNode;
            l1 = l1.next;
            l2 = l2.next;
        }
        l2 = head;
        while(l2 != null){
            Node copyNode = map.get(l2);
            if (l2.random != null) {
                copyNode.random = map.get(l2.random);
            }
            l2 = l2.next;
        }
        return dummy.next;
    }
}