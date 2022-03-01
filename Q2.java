import java.util.*;


// Write another method, accepts two arguments as an input, which these two
// arguments are the index value of the corresponding elements in the linked list. Write a
// method to swap the position of this two elements, e.g. , from <1,3* ,5,7,9,11 * > to
// <1,11,5,7,9,3>.

public class Q2 {
    
    public static LinkedList<Integer> SwapElements (LinkedList<Integer> list, int firstIndex, int secondIndex) {

        int temp = list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, temp);

        return list;
    }

    
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
        
        System.out.println("Original list:");
        System.out.println(myList);
        
        // Scanner reader = new Scanner(System.in);
        
        // System.out.print("Enter first index: ");
        // int index1 = reader.nextInt();
        // System.out.print("Enter second index: ");
        // int index2 = reader.nextInt();
        
        myList = SwapElements(myList, 2, myList.size() - 1);
        
        System.out.println("Swapped list:");
        System.out.println(myList);

        // reader.close();
    }

}
