import java.util.*;

public class MinimumSpanningTree {

    static Map<Integer, Integer> Parent = new HashMap<Integer, Integer>();
    static Map<Integer, Integer> Rank = new HashMap<Integer, Integer>();

    public static void make_family(int s) {
            Parent.put(s, s);
            Rank.put(s, 0);

    }

    public static int union(int s, int t) {
        int s_rep = find(s);
        int t_rep = find(t);

        if (Rank.get(s_rep) < Rank.get(t_rep))
            Parent.put(s_rep,t_rep);
        else if (Rank.get(s_rep) > Rank.get(t_rep))
            Parent.put(t_rep,s_rep);
        else {
            Parent.put(s_rep,t_rep);
            int rank = Rank.get(t_rep);
            Rank.put(t_rep,rank+1);
        }

        return find(s);
    }

    public static int find(int s) {
        while(s != Parent.get(s))
            s = Parent.get(s);
        return s;
    }

    public static int mst(ArrayList<ArrayList<Integer>> edges, int vertices) {
        int Cost=0;
        //Sort the edges list
        Collections.sort(edges, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o1.get(2).compareTo(o2.get(2));
            }
        });

        //Initialize
        for (int i=0;i<vertices;i++){
            make_family(i);
        }

        //Kruskal's code
        for (int j=0;j<edges.size();j++){
            if (find(edges.get(j).get(0))!=find(edges.get(j).get(1)) ){
                Cost=Cost+edges.get(j).get(2);
                union(edges.get(j).get(0),edges.get(j).get(1));
            }
        }

        return Cost;
    }

    public static void main(String[] args) {
        int vertices = 7;
        // [u, v, w]
//        Integer[][] ed = {{0, 1, 3}, {1, 2, 1}, {2, 0, 2}};
//        Integer ed[][] = {{0, 1, 1}, {0, 2, -5}, {0, 3, 1}, {1, 2, 2}, {2, 3, -1}, {2, 4, 0}, {3, 4, -2}, {5, 4, 6}, {5, 6, 1}};
        Integer ed[][] = {{}};
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        for (Integer[] arr : ed) edges.add(new ArrayList(Arrays.asList(arr)));
        // select [0, 2] and [1, 2]
        int ans = 3;
        int funAns = MinimumSpanningTree.mst(edges, vertices);
        System.out.println(funAns);
//        assertEquals(MinimumSpanningTree.mst(edges, vertices), ans);
    }
}
