
import java.util.Arrays;

/**
 * code
 */
public class code {

    public static int difMinMax(int arr[],int m){

        int diferent=Integer.MAX_VALUE;

        Arrays.sort(arr);
        if(arr.length==0){
            return -1;
        }
        if(arr.length-1 <m){
            return -1;
        }
        for(int i=0;i<arr.length-m;i++){
            int nexWindows=i+m-1;

            diferent=Math.min(arr[diferent], arr[nexWindows]);



        }

        return  diferent;

    }
    public static void main(String[] args) {
        int arr[]={12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m=5;
        System.out.println(difMinMax(arr,m));
    }
}