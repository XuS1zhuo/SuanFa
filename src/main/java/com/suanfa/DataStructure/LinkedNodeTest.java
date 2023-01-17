package com.suanfa.DataStructure;

/**
 * @Author XuS1zhuo
 * @Description TODO
 * @Date 2023/1/14 21:30
 * @Version 1.0
 */
public class LinkedNodeTest {
    public static void main(String[] args) {
        //构建一个三个节点的双向链表
        LinkedNode linkedNode1 = new LinkedNode("linkedNode1");
        LinkedNode linkedNode2 = new LinkedNode("linkedNode2");
        LinkedNode linkedNode3 = new LinkedNode("linkedNode3");
        linkedNode1.next = linkedNode2;
        linkedNode2.prev = linkedNode1;
        linkedNode2.next = linkedNode3;
        linkedNode3.prev = linkedNode2;
        //测试  拿到第一个节点的下一个节点测试链表
        System.out.println(linkedNode1.getNext().data);
        System.out.println(linkedNode1.getNext().getNext().data);

    }
}
