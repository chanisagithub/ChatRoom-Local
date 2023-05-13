/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatroom;

/**
 *
 * @author chani
 */
public class List<T> {

    private Node start;

    public void add(T obj) { //add to the last
        Node n1 = new Node(obj);
        if (start == null) {
            start = n1;
        } else {
            Node lastNode = start;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = n1;
        }
    }

    public int size() {
        int count = 0;
        Node temp = start;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public boolean add(int index, T obj) {
        if (index >= 0 && index <= size()) {
            Node n1 = new Node(obj);
            if (index == 0) {
                n1.next = start;
                start = n1;
            } else {
                Node temp = start;
                int count = 0;
                while (count < index - 1) {
                    temp = temp.next;
                    count++;
                }
                n1.next = temp.next;
                temp.next = n1;
            }
            return true;
        }
        return false;
    }

    public boolean remove(int index) {
        if (index >= 0 && index < size()) {
            if (index == 0) {
                start = start.next;
            } else {
                Node temp = start;
                int count = 0;
                while (count < index - 1) {
                    count++;
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String list = "{";
        Node temp = start;
        while (temp != null) {
            list += temp.obj + ", "; //obj.toString()
            temp = temp.next;
        }
        return start == null ? "{empty}" : list + "\b\b}";
    }
    public boolean remove(T obj){
        int index=search(obj);
        return remove(index);
    }
    public int search(T obj) {
        int index = 0;
        Node temp = start;
        while (temp != null) {
            if (temp.obj.equals(obj)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public boolean set(int index, T obj) {
        Node n1 = new Node(obj);
        if (index >= 0 && index < size()) {
            Node temp = start;
            int count = 0;
            while (count < index - 1) {
                temp = temp.next;
                count++;
            }
            n1.next = temp.next.next;
            temp.next = n1;
            return true;
        }
        return false;
    }

    public T get(int index) {
        if (index >= 0 && index < size()) {
            Node temp = start;
            int count = 0;
            while (count < index) {
                temp = temp.next;
                count++;
            }
            return temp.obj;
        }
        return null;
    }

    class Node {

        private T obj;
        private Node next;

        Node(T obj) {
            this.obj = obj;
        }
    }
}
