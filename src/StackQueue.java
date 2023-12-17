public class StackQueue {

    //Instance data
    private Stack DValue; // first stack
    private Stack EValue; // second stack
    private int size;

    //Empty Constructor
    public StackQueue() {
        DValue = new Stack();
        EValue = new Stack();
        size = 0;
    }

    //METHODS

    //add an element
    public <E> void enqueue(E element) {
        // Move all elements from DValue to EValue
        while (!DValue.isEmpty()) //while DValue is not empty
        {
            EValue.push(DValue.pop());
        }

        // Push elements to DValue
        DValue.push(element);

        // Push everything back onto DValue
        while (!EValue.isEmpty())//while EValue is not empty
        {
            DValue.push(EValue.pop());
        }

        size++;
    }

    //remove and return the least recent element
    public <E> E dequeue()  {
        // if first stack is empty
        if (DValue.isEmpty() == true ) {
            return null;
        }

        // Return first input of Dvalue
        E temp = (E) DValue.peek();
        DValue.pop();

        size--;

        return temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    //look at the least recent element without removing
    public <E> E peek() {
        return (E) DValue.peek();
    }

}
