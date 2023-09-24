package linear.linkedlist;

import linear.Node;
import linear.list.MyList;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class MyLinkedList<T> implements MyList, Cloneable{
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
        return false;
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

    }

    @Override
    public void set(long index, Object data) {

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

    public boolean addAll(MyLinkedList list){
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
    public MyLinkedList subList(long fromIndex, long toIndex){
        return null;
    }


    @Override
    public MyLinkedList<T> clone() {
        try {
            MyLinkedList clone = (MyLinkedList) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public Stream myList_stream() {
        // need to return a stream of the data in the list

        return Stream.builder().build();
    }
}
