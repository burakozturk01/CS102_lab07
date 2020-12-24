/**
 * A simple stack class with two queue instances
 */
public class SimpleStackWithQueue
{
    // properties
    private SimpleQueue q1, q2;

    // constructors
    public SimpleStackWithQueue()
    {
        q1 = new SimpleQueue();
        q2 = new SimpleQueue();
    }

    // methods
    public void push(String data)
    {
        q2.enqueue(data);

        while (!q1.isEmpty())
            q2.enqueue(q1.dequeue());

        SimpleQueue tmp = q1;
        q1 = q2;
        q2 = tmp;
        tmp = null;
    }

    public String pop()
    {
        return q1.dequeue();
    }

    public String toString()
    {
        String reverse = q1.listToString();
        String ordered = "";
        String[] splits;

        splits = reverse.split("\n");

        for (int i = splits.length - 1; i >= 0; i--)
        {
            ordered += splits[i];

            if (i > 0)
                ordered += "\n";
        }

        return ordered;
    }
}
