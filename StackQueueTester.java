public class StackQueueTester {
    public static void main(String[] args)
    {
        SimpleQueue q = new SimpleQueue();
        System.out.println(q.isEmpty());
        q.enqueue("first");
        q.enqueue("second");
        System.out.println(q.isEmpty());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());

        System.out.println("------------------");


        SimpleStackWithQueue sq = new SimpleStackWithQueue();
        System.out.println(sq);
        sq.push("first");
        sq.push("second");
        System.out.println(sq);
        System.out.println(sq.pop());
        System.out.println(sq.pop());
        System.out.println(sq);
    }
}
