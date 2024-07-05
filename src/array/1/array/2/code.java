/**
 * code
 */
public class code {

    static void reverArray(int arr[]){

        int [] reversArray=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            reversArray[i]=arr[arr.length-1-i];
        }
        printArray(reversArray);
    }
    static void printArray(int arr[]){

        for(int x: arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        reverArray(arr);
    }

}