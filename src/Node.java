
public class Node<T> {
    private T data;
    private Node<T> next;
    private Node<T> previous;
    Node(){
        next=null;
        previous =null;
        data=null;
    }
    Node(T data) {
        this(data, null, null);
    }
    Node(T data, Node<T> next, Node<T> previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    T getData() {
        return data;
    }
    public void setNextNode(Node<T> next) {
        this.next = next;
    }
    public Node<T> getPreviousNode() {
        return previous;
    }
    public void setPreviousNode(Node<T> prev) {
        this.previous = prev;
    }
    public void setData(T data) {
        this.data = data;
    }
    public Node<T> getNextNode() {
        return next;
    }
}