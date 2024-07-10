/**
 * code3
 */
public class code3 {

    static void reverseArray(int arr[],int s,int e){
        if(s>e){
            
            return;
        }
        int temp=arr[s];
         arr[s]=arr[e];
        arr[e]=temp;
        reverseArray(arr, s+1, e-1);
    }
    static void print(int arr[]){
        for(int i:arr)
        System.out.print(i+" ");
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        reverseArray(arr, 0, arr.length-1);
        print(arr);
    }

    
}