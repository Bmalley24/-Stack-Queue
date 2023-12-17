/**
 * StackNode
 * Author: Brandon Malley
 * Collaborator: Roan
 * Date: 10/24/2023
 **/

public class Node<T, E> {
    private Node parentNode;

    private T value;
    private E eValue;



    public Node() {//Empty Consructor
        parentNode = null;
        value = null;

    }
    public Node(T data){ // 1 input Constructor
        value = data;
        parentNode = null;

    }

    public Node(T data, Node node1) { // 2 inputConstructor
        parentNode = node1;
        value = data;
    }


    //Accessors
    public Node getParentNode() {
        return parentNode;
    }

    public T getValue() {
        return value;
    }

    //Mutators
    public void setParentNode(Node newNode){
        parentNode = (newNode);
    }
    public void setValue(T newValue){
        value = (newValue);
    }

    //toString method
    public String toString() {
        return "Node:" + value;
    }

    //boolean method
    public boolean booleanEquals(Node a) {
        if (value.equals(a.getValue())){
            return true;
        } else{
            return false;
        }

    }
}
