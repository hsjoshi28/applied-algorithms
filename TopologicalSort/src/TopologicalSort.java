import java.util.ArrayList;
import java.util.List;

public class TopologicalSort {
    public static List<Integer> topoSort(List<List<Integer>> pre_requisites, int total_courses) {
        System.out.println(pre_requisites.size());
        //Graph creation // get v add w
        for(int i = 0 ; i < pre_requisites.size(); i++){

        }

        return null;
    }

    public static void main(String[] args) {
        //[[0, 1], [0, 2], [1, 2], [1, 3], [2, 4], [3, 4]]
        int total_courses = 5;
        ArrayList<ArrayList<Integer> > x
                = new ArrayList<ArrayList<Integer> >();
        List<List<Integer>> pre_requisites = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        innerList.add(0,1);
        innerList.add(0,2);
        innerList.add(1,2);
        innerList.add(1,3);
        innerList.add(1,3);
        innerList.add(2,4);
        innerList.add(3,4);
        pre_requisites.add(innerList);
        topoSort(pre_requisites, total_courses);

    }

}
