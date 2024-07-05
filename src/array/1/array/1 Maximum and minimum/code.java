
public class code {


    static int max(int arr[]){
        int length=arr.length;
        int maximum=0;
        for(int i=0;i<length;i++){
           maximum=Math.max(arr[i], maximum);
        }

        return maximum;
    }

    static  int minimum(int arr[]){
       int min= Integer.MAX_VALUE;

       for(int i=0;i<arr.length;i++)
        min=Math.min(arr[i],min);
       return min;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,53,2,1,28};
        System.out.println("Maximun number: "+max(arr));
        System.out.println("Minimum nuber is : "+minimum(arr));
    }
}