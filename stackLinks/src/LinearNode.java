

public class LinearNode<T> {

    private LinearNode<T> next;
    private T elem;

    public LinearNode() {
        this.next = null;
        this.elem = null;
    }

    public LinearNode(T elem) {
        this.next = null;
        this.elem = elem;
    }

    public LinearNode<T> getNext() {
        return this.next;
    }

    public void setNext(LinearNode<T> node) {
        this.next = node;
    }

    public T getElem() {
        return this.elem;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }
}
