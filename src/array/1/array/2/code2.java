
import java.util.Arrays;

/**
 * code2
 */
public class code2 {

    static  void reverseArray(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        
        }
        printArray(arr);

    }
    static void printArray(int arr[]){
        for(int i:arr)
            System.out.print(" "+i);
        
  
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr,0,arr.length-1);
    }
}