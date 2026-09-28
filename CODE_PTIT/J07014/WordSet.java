package J07014;

import java.util.*;
import java.io.*;

public class WordSet {
    private TreeSet<String> words = new TreeSet<>();

    public WordSet(String file_name) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(file_name))){
            String line;
            while((line = br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line);
                while(st.hasMoreTokens()){
                    words.add(st.nextToken().toLowerCase());
                }
            }
        }
    }

    private WordSet(TreeSet<String> words){
        this.words = words;
    }

    public WordSet union(WordSet other){
        TreeSet<String> res = new TreeSet<>(words);
        res.addAll(other.words);
        return new WordSet(res);
    }

    public WordSet intersection(WordSet other){
        TreeSet<String> res = new TreeSet<>(words);
        res.retainAll(other.words);
        return new WordSet(res);
    }

    @Override
    public String toString(){
        return String.join(" ", words);
    }
}
