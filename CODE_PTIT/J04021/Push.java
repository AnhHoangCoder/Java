package J04021;

import java.util.*;

public class Push {
    public static class IntSet {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
