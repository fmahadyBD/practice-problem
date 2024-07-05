
import java.util.Arrays;

class Pair {

    int min;
    int max;
}

public class code2 {

    static Pair getMinMax(int arr[], int n) {

        Pair obj = new Pair();
        Arrays.sort(arr);
        obj.min = arr[0];
        obj.max = arr[n - 1];
        return obj;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
        int n = arr.length;
        Pair minMax = getMinMax(arr, n);
        System.out.println("This is the max value: " + minMax.min);
        System.out.println("This is the max value: " + minMax.max);
    }

}
