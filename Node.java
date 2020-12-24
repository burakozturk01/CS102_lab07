/**
 * Node class
 */
public class Node
{
    // properties
    private String data;
    private Node next;

    // constructors
    public Node()
    {
        data = "";
        next = null;
    }

    // methods

    // get methods
    public String getData()
    {
        return data;
    }

    public Node next()
    {
        return next;
    }

    // set methods
    public void setData(String newData)
    {
        data = newData;
    }

    public void setNext(Node newNext)
    {
        next = newNext;
    }
}