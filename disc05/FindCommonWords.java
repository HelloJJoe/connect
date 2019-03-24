import java.util.Map;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Comparator;

public class FindCommonWords {


    public void findCommonWords(String[] words, int k) {
        
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                // The number of key "word" plus one
                map.put(word, map.get(word) + 1);
            } else {
                // create the element "word"
                map.put(word, 1);
            }
        }
        Comparator c = new Comparator<String>() {
            @Override
            public int compare (String a, String b) {
                return map.get(b) - map.get(a);
            }
        };
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(c);

        // Or you can simplify as follow:
        // PriorityQueue<String> priorityQueue = new PriorityQueue<>(new Comparator<String>() {
        //     @Override
        //     public int compare (String a, String b) {
        //         return map.get(b) - map.get(a);
        //     }
        // });


        for (String word : map.keySet()) {
            priorityQueue.add(word);
        }

        for (int i = 0; i < k; i += 1) {
            System.out.println(priorityQueue.poll());
        }

    }

    public static void main (String[] args) {

        FindCommonWords fcw = new FindCommonWords();
        String[] words = new String[]{"hello", "hello", "word", "BestWorld", "CoolWorld", "word", "BestWorld"};
        int numOfMostCommonKey = Integer.parseInt(args[0]);
        fcw.findCommonWords(words, numOfMostCommonKey);
    }
}


