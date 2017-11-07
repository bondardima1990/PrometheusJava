package com.tasks3.linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(Integer data) {
        Node node = new Node();
        node.setData(data);
        if (size == 0){
            head = node;
            tail = node;
            size++;
        } else {
            tail.setNext(node);
            tail = node;
            size++;
        }
    }

    public Integer get(int index) {
        if (size == 0 || index > size() - 1)
            return null;
        Node t = head;
        int i = 0;
        while (i < index){
            t = t.getNext();
            i++;
        }
        return  t.getData();
    }

    public boolean delete(int index) {
        if (index < 0 || head == null || index > size() - 1)
            return false;
        if (index == 0 & size() > 1){
            head = head.getNext();
            size--;
            return true;
        }
        if (head == tail){
            head.setNext(null);
            head.setData(0);
            head.setNext(null);
            tail.setData(0);
            size--;
            return true;
        }
        Node nodeDel = head;
        Node nodePrev = nodeDel;
        int i = 0;
        while (i < index){
            nodePrev = nodeDel;
            nodeDel = nodeDel.getNext();
            i++;
        }
        if (nodeDel == tail){
            tail = nodePrev;
            size--;
            return true;
        } else {
            nodePrev.setNext(nodeDel.getNext());
            size--;
            return true;
        }
    }

    public int size() {
        return size;
    }
}