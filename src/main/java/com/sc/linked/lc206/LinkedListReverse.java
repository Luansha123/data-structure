package com.sc.linked.lc206;

/**
 * 链表的反转:
 *      https://leetcode.cn/problems/reverse-linked-list/description/
 *
 *      1 -> 2 -> 3 -> 4 -> 5
 *  转成
 *      5 -> 4 -> 3 -> 2-> 1
 */
public class LinkedListReverse {

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


}
