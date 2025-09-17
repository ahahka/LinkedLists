public class MyCircularLinkedList<T> {
    private MyListNode <T> head;
    private int size = 0;

    public MyCircularLinkedList() {
        head = null;
    }

    public void addToFront(T data) {
        MyListNode<T> nodeToAdd = new MyListNode<T>(data);
        //if the list is null (edge case)
        if (head == null) {
            head = nodeToAdd;
            head.setPrevious(head);
            head.setNext(head);
        }
        //if the list is not null
        else {
            nodeToAdd.setNext(head);
            nodeToAdd.setPrevious(head.getPrevious());
            head.getPrevious().setNext(nodeToAdd);
            head.setPrevious(nodeToAdd);
            head = nodeToAdd;
        }
        size++;
    }

    public void addToEnd(T data) {
        MyListNode<T> nodeToAdd = new MyListNode<T>(data);
        if (head == null) {
            head = nodeToAdd;
            head.setPrevious(head);
            head.setNext(head);
        }
        else {
            nodeToAdd.setNext(head);
            nodeToAdd.setPrevious(head.getPrevious());
            head.getPrevious().setNext(nodeToAdd);
            head.setPrevious(nodeToAdd);
        }
        size++;
    }

    public T removeFromFront() {
        if (head == null) {
            throw new NullPointerException("CircularLinkedList is empty");
        }
        else if (head == head.getNext()) {
            head = null;
            size--;
            return null;
        }
        else {
            T data = head.getData();
            head.getPrevious().setNext(head.getNext());
            head.getNext().setPrevious(head.getPrevious());
            head = head.getNext();
            size--;
            return data;
        }
    }

    public T removeFromEnd() {
        if (head == null) {
            throw new NullPointerException("CircularLinkedList is empty");
        }
        else if (head == head.getNext()) {
            head = null;
            size--;
            return null;
        }
        else {
            T data = head.getPrevious().getData();
            head.getPrevious().getPrevious().setNext(head);
            head.setPrevious(head.getPrevious().getPrevious());
            size--;
            return data;
        }
    }

    public boolean contains (T data) {
        MyListNode<T> currentMyListNode = head;
        for (int i = 0; i<size; i++) {
            if (currentMyListNode.getData() == data) {
                return true;
            }
            currentMyListNode = currentMyListNode.getNext();
        }
        return false;
    }
    public T[] toArray() {
        
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String output = "";
        MyListNode<T> current = head;

        //edge case- head is null
        if (head == null) {
            return "null";
        }

        output += current.getData();
        current = current.getNext();
        while (current != head) {
            output += " <-> " + current.getData();
            current = current.getNext();
        }
        return output;
    }
}