import java.util.ArrayList;

public class Dijkstra {
    public class Pair implements Comparable<Pair>{
        int v;
        int w;

        Pair(int v, int w) {
            this.v = v;
            this.w = w;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.w > o.w) return 1;
            else if (this.w < o.w) return -1;
            else return 0;
        }
    }
    public static void main(String[] args) {

//        ArrayList<ArrayList<Pair>> adj = new ArrayList<ArrayList<Pair>>();
//
//        for (int i = 0; i < 4; i++) {
//            adj.add(new ArrayList<>());
//        }

        ArrayList<ArrayList<ArrayList<Integer>>> ls = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ls.add(new ArrayList<ArrayList<Integer>>());
        }
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(3);
        a2.add(4);

        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(5);
        a3.add(6);


        ls.get(0).add(a1);
        ls.get(0).add(a2);
        ls.get(0).add(a3);
        ls.get(0).add(a3);
        ls.get(0).add(a3);
        ls.get(0).add(a3);
        ls.get(0).add(a3);

        System.out.println(ls);
    }
}
