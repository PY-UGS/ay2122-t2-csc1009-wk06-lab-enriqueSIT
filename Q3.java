import java.util.LinkedList;


// Write a method, generate 500 random integer range from 1000 to 9999, in random
// order into a (new) linked list. Generate another (one) integer which also range from
// 1000 to 9999, traverses the list and see if this integer exists in the linked list. Return
// either the position if found or return -1 if not found.

public class Q3 {
    
    // Math.random seems to be outdated. Also, this is gross.
    public static int RandInt() {
        double temp = (1000 + (Math.random() * 10000));
        return (int) (temp > 9999 ? temp / 10 : temp);
    }

    // java.utils.Random is preferable?

    public static int findValue(LinkedList<Integer> list, int value) {
        return list.indexOf(value);
    }

    public static void main(String[] args) {
        int size = 500;
        LinkedList<Integer> myList = new LinkedList<Integer>();

        for (int i = 0; i < size; i++) {
            myList.add(RandInt());
        }
        
        int anotherInt = RandInt();
        
        System.out.println("Value to find: " + anotherInt);
        System.out.println("Found index: " + findValue(myList, anotherInt));
    }
}
