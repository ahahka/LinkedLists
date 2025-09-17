public class MyListNode<T> {
    private T data;
    private MyListNode<T> previous;
    private MyListNode<T> next;

    public MyListNode(T data) {
        this.data = data;
        previous = null;
        next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MyListNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(MyListNode<T> previous) {
        this.previous = previous;
    }

    public MyListNode<T> getNext() {
        return next;
    }

    public void setNext(MyListNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        String p;
        String n;

        if (previous == null) {
            p = "null";
        }
        else {
            p = "" + previous.data;
        }

        if (next == null) {
            n = "null";
        }
        else {
            n = "" + next.data;
        }

        return p + " <- " + data + " -> " + n; 
    }
}