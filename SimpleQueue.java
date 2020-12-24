/**
 * A simple queue class by using SimpleLinkedList class
 */
public class SimpleQueue
{
    // properties
    SimpleLinkedList list;

    // constructors
    public SimpleQueue()
    {
        list = new SimpleLinkedList();
    }

    // methods
    public void enqueue(String data)
    {
        list.addToTail(data);
    }

    public String dequeue()
    {
        if (isEmpty())
            return null;

        return list.removeFromHead();
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }
}
