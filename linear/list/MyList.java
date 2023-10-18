package linear.list;

import java.util.function.Consumer;
import java.util.stream.Stream;

public interface MyList<T>{
     void  add(T data);
    void  remove(T data);
    void  remove(long index);
    void  clear();
     Object get(long index);
    long  indexOf(T data);
     boolean  contains(T data);
     boolean  isEmpty();
     long  size();
     boolean addAll(MyList<T> list);
    boolean  addAll(long index, MyList<T> list);
    boolean  removeAll(MyList<T> list);
    boolean  retainAll(MyList<T> list);
    void  reverse();
    void  sort();
    void  swap(long index1, long index2);
    void  set(long index, T data);
       //void  add(long index, T data);
    void  removeRange(long fromIndex, long toIndex);
    void  trimToSize();
    void  forEach(Consumer<T> consumer);
    default Stream myListStream(){
        return Stream.of();
    }
}

