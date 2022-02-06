import java.util.Arrays;

public class InsertClass {

    public static int[] sort(int[] array){
        int[] sortedArray = new int[array.length];
        int i=0;
        while( i == array.length){
            sortedArray[i] = array[i];
            Arrays.stream(sortedArray).sorted();
            i++;
        }
        return sortedArray;
    }

    public static void main(String[] args) {

        int[] a = {5,8,7,2,3};
        int[] sorted = sort(a);
        for (int j:sorted) {
            System.out.println(sorted[j]);
        }
        System.out.println(sorted.length);
    }
}
