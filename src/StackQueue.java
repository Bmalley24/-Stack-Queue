public class StackQueue {

    //Instance data
    private Stack DValue; // dequeueing
    private Stack EValue; // enqueueing
    private int size;

    //Empty Constructor
    public StackQueue() {
        DValue = new Stack();
        EValue = new Stack();
        size = 0;
    }

    //Methods

    //add an element
    public <E> void enqueue(E element) {

    }

    //remove and return the least recent element
    public <E> E dequeue()  {

    }


    public boolean isEmpty() {
        return size == 0;
    }


    public int size() {
        return size;
    }

    //look at the least recent element without removing
    public <E> E peek() {

    }

}
