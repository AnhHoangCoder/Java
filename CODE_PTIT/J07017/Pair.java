package J07017;

public class Pair<A, B> {
    private A first;
    private B second;

    public Pair(A a, B b){
        this.first = a;
        this.second = b;
    }

    public boolean isPrime(){
        return checkPrime((Integer)first) && checkPrime((Integer)second);
    }

    private boolean checkPrime(int n){
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        for(int i = 5; i * i <= n; i += 6){
            if(n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return first + " " + second;
    }
}
