// import java.util.*;


// 4. Redo question 1 in a Hash format, can you make it? Do you think that it’s a good idea?
// No. Not a good idea, because the hashmap is unordered and does not define order of iteration. 
// Adding a k-v pair into a hashmap is possible, but there is no order to inject the pair into.


// Yes, badly, if I use an extra LinkedList to store the key values. No, because the hashmap is unordered and does not define order of iteration.
// Using https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html

// Yes, with the LinkedHashMap


// public class Q4 {
//       // Attempt at getting an order for the HashMap, and inserting them in order back into a HashMap for return.
//       // Better to just use a LinkedHashMap.
//     public static HashMap<String, Integer> InsertIntoHashMap (HashMap<String, Integer> map, List<String> keyList, int value) {

//         HashMap<String, Integer> tempMap = new HashMap<String, Integer>();

//         String id = UUID.randomUUID().toString();

//         keyList.add(id);

//         for (int i = 0; i < map.size(); i++) {
//             tempMap.put(keyList.get(i), map.get(keyList.get(i)));

//             if(map.get(keyList.get(i)) < value) 
            
//             System.out.println("score " + i + ": " + map.get(keyList.get(i)));
//         }
        
//         return map;
//     }


//     public static void main(String[] args) {
//         int[] temp = { 1, 3, 5, 7, 9, 11 };
//         String id;
        
//         List<String> temp2 = new ArrayList<>();
        
//         HashMap<String, Integer> numbers = new HashMap<String, Integer>();
//         for (int i = 0; i < temp.length; i++) {
//             id = UUID.randomUUID().toString();
//             temp2.add(id);
//             numbers.put(id, temp[i]);
//         }
        
//         int value = 6;
//         id = UUID.randomUUID().toString();
        
//         temp2.add(id);
//         numbers.put(id, value);


//         for (int i = 0; i < numbers.size(); i++) {
//             HashMap<String, Integer> tempMap = new HashMap<String, Integer>();
//             tempMap.put(temp2.get(i), numbers.get(temp2.get(i)));

//             if(numbers.get(temp2.get(i)) < value) 
            
//             System.out.println("score " + i + ": " + numbers.get(temp2.get(i)));
//         }
        
//         for (int i : numbers.values()) {
//             System.out.println(i);
//         }
        

//     }

    
// }
