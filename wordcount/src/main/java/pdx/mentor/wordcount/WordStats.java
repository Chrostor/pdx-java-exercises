package pdx.mentor.wordcount;

import java.util.*;

/**
 * WordStats collects stats supplied from an external word source.
 */
public class WordStats {

    int totalWordCount;

    Map<String, Integer> wordMap = new TreeMap<>();
    List<String> ls = new ArrayList<>();

    public void process(Iterator<String> iter) {
        while (iter.hasNext()) {
            String word = iter.next();


            if (!wordMap.containsKey(word)) {
                wordMap.put(word, 1);
            } else {
                int wordCount = wordMap.get(word);
                wordCount++;
                wordMap.put(word, wordCount);
            }


            // do something fancier here, like maybe with a Map ;-)
            totalWordCount++;

        }
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            ls.add(entry.getValue() + " " + entry.getKey());
        }
        Collections.sort(ls);
//        ls.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                String a = o1.substring(0);
//                String b = o2.substring(0);
//                int compare = a.compareTo(b);
//                if(compare == 0){
//                    return 0;
//                } else if (compare < 0){
//                    return -1;
//                } else {
//                    return 1;
//                }
//
//            }
//        });
        for (String part : ls) {
            System.out.println(part);

        }
        getCountEachWord();
    }

    public int getTotalWordCount() {
        return totalWordCount;
    }

    public void getCountEachWord() {

        System.out.println("Total Word Count " + totalWordCount);

    }
}
