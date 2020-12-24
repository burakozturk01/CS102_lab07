/**
 * Test class to test SimpleLinkedList
 */
public class SLLTest
{
    public static void main(String[] args)
    {
        // 1: Create a list
        SimpleLinkedList ExList;
        ExList = new SimpleLinkedList();

        // 2: Add a number of strings to it
        ExList.addToTail("1st string");
        ExList.addToTail("2nd string");
        ExList.addToTail("3rd string");
        ExList.addToTail("4th string");
        ExList.addToTail("5th string");

        // 3: Print the entire list
        System.out.println("3:");
        System.out.println("Entire list: \n" + ExList);

        // 4: Get items at various index locations within the list
        System.out.println("4:");
        System.out.println(ExList.get(-1));
        System.out.println(ExList.get( 0));
        System.out.println(ExList.get( 1));
        System.out.println(ExList.get( 2));
        System.out.println(ExList.get( 3));
        System.out.println(ExList.get( 4));
        System.out.println(ExList.get( 5));

        // 5: Remove items from it one-by-one, each time printing it out again
        System.out.println("5:");
        int fixedLength = ExList.getLength();
        for (int i = 0; i < fixedLength; i++)
        {
            System.out.println("Index i: " + ExList.removeFromHead());

            System.out.println("Entire list: \n" + ExList);
        }
    }
}