package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    //private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            Node newNode = new Node(i);
            last.setNext(newNode) ;
            newNode.setPrev(last);
            last = newNode;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
