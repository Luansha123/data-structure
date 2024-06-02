package com.sc.linked.lc206;

public class LinkedListReverseSolve {

    static class Node {
        public int val;
        public Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    '}';
        }
    }

    public static void main(String[] args) {
        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        printList(node1);
        System.out.println("----------------------------");

        reverseNode(node1);

        printList(node5);

    }

    private static void printList(Node node1) {
        while(node1 != null) {
            System.out.println(node1);
            node1 = node1.next;
        }
    }

    private static Node reverseNode(Node node1) {
        if (node1.next   == null) {
            return node1;
        }

        Node nextNode = reverseNode(node1.next);
        node1.next = null;
        nextNode.next = node1;


        return node1;
    }

}
