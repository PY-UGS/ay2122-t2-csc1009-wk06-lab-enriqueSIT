// import java.util.*;

// 6. Redo question 3 in a Hash format, can you make it? Do you think that it’s a good idea?
// No. Not a good idea, because the hashmap is unordered and does not define order of iteration. 
// It is not possible to return "either the position if found or return -1 if not found"
// as there is no position to return.


// public class Q6 {

//     public static class Tuple2<K, V> {
//         private K key;
//         private V value;
      
//         public Tuple2(K key, V value){
//             this.key = key;
//             this.value = value;
//         }
//     }
    
//     public static Tuple2<String, Integer> getKVPair(int value) {
//         return new Tuple2<String,Integer>(UUID.randomUUID().toString(), value);
//     }
    
//     // Math.random seems to be outdated, use updated method in your Sandbox.
//     public static int RandInt() {
//         double temp = (1000 + (Math.random() * 10000));
//         return (int) (temp > 9999 ? temp / 10 : temp);
//     }

//     // public static int findValue(HashMap<String, Integer> hashmap, int value) {
//     //     return hashmap.values().contains(value) ? 
//     // }

    
//     public static void main(String[] args) {
        
//         int size = 500;
//         String id;

//           // Replace with LinkedHashMap to get a predictable order.
//         LinkedList<Integer> myList = new LinkedList<Integer>();
//         HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
//         for (int i = 0; i < size; i++) {
//             id = UUID.randomUUID().toString();
//             myHashMap.put(UUID.randomUUID().toString(), RandInt());
//         }

//         int anotherInt = RandInt();

//         // System.out.println(findValue(myList, anotherInt));
        

//     }
// }
