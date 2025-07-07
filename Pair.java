class pair <T, U> {
    T t;
    U u;
    pair(T t, U u) {
        this.t = t;
        this.u = u;
    }

    public T getT() {
        return this.t;
    }

    public U getU() {
        return this.u;
    }

}

public class Pair {
    public static void main(String[] args) {
        pair<String, Integer> a = new pair<>("alice", 12);
        String b = a.getT();
        int c = a.getU();
        System.out.println(b + Integer.toString(c));

    }
}
