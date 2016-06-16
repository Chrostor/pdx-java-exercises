package pdx.mentor.wordcount;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {


    public static void main(String[] args) {
        WordStats ws = new WordStats();
        ArrayList<String> testAL = new ArrayList<>();
        testAL.add("one");
        testAL.add("two");
        testAL.add("three");
        testAL.add("four");
        testAL.add("four");
        testAL.add("four");
        testAL.add("five");
        testAL.add("five");
        testAL.add("five");
        testAL.add("five");
        testAL.add("five");
        testAL.add("five");
        testAL.add("five");
        testAL.add("five");
        testAL.add("five");
        testAL.add("five");
        testAL.add("five");
        testAL.add("five");

        Iterator<String> iter = testAL.iterator();
        ws.process(iter);



    }
}
