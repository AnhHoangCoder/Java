package J04021;

import java.util.*;

public class IntSet {
    private Set<Integer> s;

    public IntSet(int[] a){
        s = new TreeSet<>();
        for(int x : a){
            s.add(x);
        }
    }

    public Set<Integer> getSet(){
        return s;
    }

    public IntSet union(IntSet other){
        Set<Integer> ans = new TreeSet<>(s);
        for(Integer x : other.getSet()){
            ans.add(x);
        }

        IntSet res = new IntSet(new int[0]);
        res.s = ans;
        return res;
    }

    @Override
    public String toString(){
        String ans = "";
        for(Integer x : s){
            ans += x + " ";
        }
        return ans;
    }
}
