package ak;

public class Node<T> implements Cloneable {


    public Node  prev;
    public T data;
    public Node  next;

    public Node(T data) {
        this.data = data;
    }

    public Node getPrev() {
        return prev;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    @Override
    public Node clone() {
        try {
            Node clone = (Node) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
