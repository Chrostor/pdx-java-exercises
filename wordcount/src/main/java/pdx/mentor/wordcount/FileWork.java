package pdx.mentor.wordcount;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Loren on 6/16/2016.
 */
public class FileWork {
    private File fileName = new File("C:\\Users\\Loren\\IdeaProjects\\pdx-java-exercises\\wordcount\\src\\main\\java\\pdx\\mentor\\wordcount\\test.txt");

    private ArrayList<String> als = new ArrayList<>();
    public FileWork(){
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Error: File not found");
        }
        sendToArray();
    }
    public Iterator<String> getArrayIter (){
        Iterator<String> it = als.iterator();
        return it;
    }

    private ArrayList<String> sendToArray() {
        ArrayList<String> lsb = new ArrayList<>();


        return lsb;
    }

    private String readFile() throws IOException {

        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null){
            String[] data = line.toLowerCase().split(" ");

            als.addAll(Arrays.asList(data));
        }
        return line;

    }
}
