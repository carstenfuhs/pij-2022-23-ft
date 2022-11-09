/**
 * Implementation of interface stack using a 
 * dynamic structure as support. 
 */
public class PointerStringStack implements StringStack {
    /** The head of the stack: the first node. */
    private StringStackNode head;

    /**
     * Constructs an empty stack.
     */
    public PointerStringStack() {
        head = null;
    }

    /**
     * Adds newText to this stack.
     * @param newText to be added to this stack
     */
    public void push(String newText) {
        StringStackNode newNode = new StringStackNode(newText);
        newNode.setNext(head); // works as intended also if head == null
        head = newNode;
    }

    /**
     * Returns and removes the top element of this stack. Returns null if
     * this stack is empty.
     * @return the top element on this stack, null if this stack is empty
     */
    public String pop() {
        if (head == null) {
            return null;
        }
        String result = head.getText();
        head = head.getNext();
        return result;
    }

    /**
     * Returns the top element of this stack. Returns null if
     * this stack is empty.
     * @return the top element on this stack, null if this stack is empty
     */
    public String peek() {
        if (head == null) {
            return null;
        }
        return head.getText();
    }

    /**
     * @return whether this stack is empty
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * @return the number of Strings stored in this stack.
     */
    public int getSize() {
        int result = 0;
        StringStackNode currentNode = head;
        while (currentNode != null) {
            result++;
            currentNode = currentNode.getNext();
        }
        return result;
    }
}
