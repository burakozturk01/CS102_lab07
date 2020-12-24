/**
 * SimpleLinkedList class with a chain of Node objects
 */
public class SimpleLinkedList
{
    // properties
    private Node head;
    private int length;

    // constructors
    public SimpleLinkedList()
    {
        head = new Node();
        length = 0;
    }

    // methods
    public void addToTail(String data)
    {
        Node ring = head;

        // Walks through chain until finding empty tail
        while (ring.getData() != null)
            ring = ring.next();

        // Setting tail's data and adding new empty tail node
        ring.setData(data);
        ring.setNext(new Node());

        length++;
    }

    public String removeFromHead()
    {
        // Gets head's data and 2nd head becomes head
        String data = head.getData();
        head = head.next();

        length--;

        return data;
    }

    public int getLength()
    {
        return length;
    }

    public boolean isEmpty()
    {
        return length == 0;
    }

    // get method with given data
    public Node get(String data)
    {
        // Empty fail check
        if (isEmpty())
            return null;

        Node ring = head;

        // Walks through chain until finds "data" in a node
        while (head.getData().equals(data))
        {
            ring = ring.next();

            // if ring is tail node, returns null
            if (ring.next() == null)
                return null;
        }

        return ring;
    }

    public String toString()
    {
        String repr = ""; // Representation string
        Node ring = head;

        // Writes chain's datas to repr line by line
        for (int i = 0; i < length; i++)
        {
            repr += ring.getData();
            ring = ring.next();

            // Only if next node is the tail, don't add next line char
            if (i < length - 1)
                repr += "\n";
        }

        return repr;
    }

    // get method with integer index
    public Node get(int index)
    {
        // Out of bounds fail safe
        if (index < 0 || index >= length)
            return null;

        int count = 0;
        Node ring = head;

        // Walks through chain until gets to index
        while (count != index)
        {
            ring = ring.next();
            count++;
        }

        return ring;
    }
}
