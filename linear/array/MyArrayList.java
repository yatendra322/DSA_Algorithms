package linear.array;

import linear.list.MyList;

import java.util.RandomAccess;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MyArrayList<T>
        implements MyList, RandomAccess, Cloneable, java.io.Serializable {
    private Object[] elementData;

    MyArrayList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    MyArrayList(Object... el) {
        // elementData = new Object[initialCapacity];
    }

    @Override
    public void add(Object data) {


    }

    @Override
    public void remove(Object data) {

    }

    @Override
    public void remove(long index) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(long index) {
        return null;
    }

    @Override
    public long indexOf(Object data) {
        return 0;
    }

    @Override
    public boolean contains(Object data) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public long size() {
        return 0;
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

    @Override
    public void reverse() {

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

    @Override
    public Stream myListStream() {
        return MyList.super.myListStream();
    }
}
