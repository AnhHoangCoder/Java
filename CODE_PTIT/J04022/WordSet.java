package J04022;

import java.util.*;

public class WordSet {
    private TreeSet<String> s;

    public WordSet(String line){
        s = new TreeSet<>();
        String[] input = line.split(" ");
        for(String word : input){
            s.add(word.toLowerCase());
        }
    }

    public String union(WordSet other){
        Set<String> Union = new TreeSet<>(s);
        Union.addAll(other.s);

        String result = "";
        for(String word : Union){
            result += word + " ";
        }
        return result;
    }

    public String intersection(WordSet other){
        Set<String> Intersection = new TreeSet<>(s);
        Intersection.retainAll(other.s);

        String result = "";
        for(String word : Intersection){
            result += word + " ";
        }
        return result;
    }
}
