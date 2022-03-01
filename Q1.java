import java.util.*;



// Given a sorted integer linked list, say <1,3,5,7,9,11>. You are going to insert an integer
// into this list which the order of the list still in force. Write a method for this
// requirement, you are required to print out the list before and after the change# .
// Sample method: addAndSort (LinkedList<Integer> list, int value)

public class Q1 {
    
    public static LinkedList<Integer> addAndSort (LinkedList<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < value) continue;
            list.add(i, value);
            break;
        }
        return list;
    }

    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
        
        System.out.println("Original list:");
        System.out.println(myList);
        
        // Scanner reader = new Scanner(System.in);
        int value = 6;
        
        // System.out.print("Enter a value to insert into the list: ");
        // value = reader.nextInt();
        
        myList = addAndSort(myList, value);
        
        System.out.println(myList);
        
        myList.removeIf(x -> x == value);
        
        System.out.println("New list:");
        System.out.println(myList);
        
        // reader.close();
        
    }
}
