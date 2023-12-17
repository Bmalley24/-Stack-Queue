/**
 * Stack
 * Author: Brandon Malley
 * Collaborator:
 * Date: 10/24/2023
 **/

public class Stack<T, E> {

    //instance data
    private Node topValue;
    private int size;

    //default constructors
    public Stack() {
        size = 0;
        topValue = new Node();
    }

    //Methods

    //add an element
    public void push(E element) {
        Node newValue = new Node<>(element, topValue);
        topValue = newValue;
        size++;
    }

    //remove and return the top element
    public T pop() {
        Node newValue = topValue;
        topValue = topValue.getParentNode();
        size = size - 1;
        return (T) newValue.getValue();
    }

    //checks if the Stack has any values
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    //checks how many values are currently in  stack
    public int size() {
        return size;
    }

    //look at the top element without removing
    public T peek() {
        return (T) topValue.getValue();
    }

}

