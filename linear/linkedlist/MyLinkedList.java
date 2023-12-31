package linear.linkedlist;

import linear.Node;
import linear.array.MyArrayList;
import linear.list.MyList;

import java.io.Serializable;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MyLinkedList<T> implements MyList<T>, Cloneable, Serializable {
    private Node head, tail;
    long size;
    public MyLinkedList(){

    }

    @Override
    public void add(Object data) {
        if(head ==null){
            head = new Node(data);
            tail = head;
        }else{
            Node newNode = new Node(data);
            //newNode
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            //head.next = newNode;
        }
    }

    private void add(Node node, MyLinkedList<T> obj) {

        if (obj.head == null) {
            obj.head = node;
            obj.tail = node;
        } else {
            obj.tail.next = node;
            node.prev = obj.tail;
            obj.tail = node;
        }
    }

    @Override
    public void remove(Object data) {

    }

    @Override
    public void remove(long index) {
        Node currNode = head;
        long currIndex  = 0;
        while(currNode.next != null){
            if(currIndex == index){
                currNode.prev.next = currNode.next;
                currNode.next.prev = currNode.prev;
                break;
            }
            currNode = currNode.next;
            currIndex++;
        }
    }

    @Override
    public void clear() {head = null; tail = null;}

    @Override
    public Object get(long index) {
        Node currNode = head;
        long currIndex  = 0;
        while(currNode.next != null && currIndex < index){
            currNode = currNode.next;
            currIndex++;
            if (currIndex == index){
                return currNode.data;
            }
        }
        return null;
    }

    @Override
    public long indexOf(Object data) {
            Node currNode = head;
            long currIndex  = 0;
            while(currNode.next != null){
                currNode = currNode.next;
                currIndex++;
                if(currNode.data == data){
                    return currIndex;
                }
                currNode = currNode.next;
                currIndex++;

            }

            return currNode.data == data ? currIndex : -1;


    }

    @Override
    public boolean contains(Object data) {
        Node currNode = head;
        while(currNode.next != null) {
            if (head.data == data)
                return true;
            currNode = currNode.next;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public long size() {
        return size;
    }

    @Override
    public boolean addAll(MyList list) {
        if (list.isEmpty())
            return false;
        if (list instanceof MyLinkedList<?>) {
            MyLinkedList<T> list1 = (MyLinkedList<T>) list;
            if (head == null) {
                head = list1.head;
                tail = list1.tail;
            } else {
                tail.next = list1.head;
                list1.head.prev = tail;
                tail = list1.tail;
            }
        } else if (list instanceof MyArrayList) {
            MyArrayList<T> list1 = (MyArrayList<T>) list;
            for (T t : list1) {
                add(t);
            }
        }
        return true;
    }



    @Override
    public boolean addAll(long index, MyList list) {
        return false;
    }

    @Override
    public boolean removeAll(MyList list) {
        return false;
    }

    @Override
    public boolean retainAll(MyList list) {
        return false;
    }

    public void  reverse(){
      throw   new UnsupportedOperationException("This operation is currNode yet");
    }

    @Override
    public void sort() {

    }

    @Override
    public void swap(long index1, long index2) {
        long smallIndex = Math.min(index1, index2);
        long bigIndex = Math.max(index1, index2);
        Node currNode = head;
        long index = 0;
        Node firstNode = null;

        while (currNode.next != null && index <= bigIndex) {
            if (index == smallIndex)
                firstNode = currNode;
            currNode = currNode.next;
            index++;
        }
        Object nodeData = currNode.prev.data;
        currNode.prev.data = firstNode;
        firstNode.data = nodeData;

    }

    @Override
    public void set(long index, Object data) {
        Node currNode = head;
        int nodeIndex = 0;
        while (currNode.next != null) {
            if (nodeIndex == index) {
                currNode.data = data;
                break;
            }
            if (nodeIndex > index)
                throw new ArrayIndexOutOfBoundsException("you do not enough elements in linked lists");

            currNode = currNode.next;
            nodeIndex++;
        }

    }

    @Override
    public void removeRange(long fromIndex, long toIndex) {

    }

    @Override
    public void trimToSize() {

    }

    @Override
    public void forEach(Consumer consumer) {

    }

    public boolean addAll(MyLinkedList<T> list) {
        if(list.isEmpty()){
            return false;
        }
        if(head == null){
            head = list.head;
            tail = list.tail;
        }else {
            tail.next = list.head;
            list.head.prev = tail;
            tail = list.tail;

        }
        return true;
    }

    public MyLinkedList<T> subList(long fromIndex, long toIndex) throws CloneNotSupportedException {
        Node currNode = head;
        long currIndex = 0;
        MyLinkedList<T> subList = null;
        try {
            subList = (MyLinkedList<T>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException(e.getMessage());
        }

        while (currNode != null) {
            if (currIndex >= fromIndex && currIndex < toIndex) {
                subList.add(currNode.clone(), subList);
                subList.size++;
            }
            currNode = currNode.next;
            currIndex++;
        }
        if (currIndex < fromIndex || currIndex < toIndex)
            throw new ArrayIndexOutOfBoundsException("you do not enough elements in linked lists");
        return subList;
    }


    /**
     * if you see here the deep clone is get accomplished.
     */
    @Override
    public MyLinkedList<T> clone() throws CloneNotSupportedException {

        MyLinkedList<T> clone = null;
        try {
            clone = subList(0, size);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clone;
    }

    @Override
    public Stream myListStream() {
        // need to return a stream of the data in the list

        return Stream.of(this).flatMap(fl -> Stream.of(fl.head));
    }
}
