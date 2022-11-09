/**
 * A basic stack of Strings.
 */
public interface StringStack {
    /**
     * Pushes a new string onto the stack.
     * @param newText to be pushed onto the stack
     */
    void push(String newText);

    /**
     * Returns and removes the last element from the stack. 
     * If the stack is empty, returns null.
     * @return the last element from the stack (also gets removed);
     *  if the stack is empty, returns null.
     */
    String pop();

    /**
     * Returns the last element from the stack, but does not remove it.
     * Returns null if the stack is empty.
     * @return the last element from the stack (does not remove it);
     *  if the stack is empty, returns null.
     */
    String peek();

    /**
     * @return true if the stack contains no elements, false otherwise.
     */
    boolean isEmpty();
}
