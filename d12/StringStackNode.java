/**
 * A node in a dynamic singly-linked list of Strings.
 */
public class StringStackNode {

    /** The textual content of this StringStackNode. May be null. */
    private String content;

    /** Pointer to the next node in the list; null if there is no next node. */
    private StringStackNode next;

    /**
     * Constructs a new StringStackNode with txt as its text content
     * and with null as the next node.
     * @param txt the textual content of the node; may be null
     */
    public StringStackNode(String txt) {
        content = txt;
        next = null;
    }

    /**
     * @return the text content stored in this node
     */
    public String getText() {
        return content;
    }

    /**
     * Sets the next node from this node.
     * @param node the node to which this node should point as the next one
     */
    public void setNext(StringStackNode node) {
        next = node;
    }

    /**
     * Gets the next node from this node.
     * @return the next node from this node
     */
    public StringStackNode getNext() {
        return next;
    }
}
