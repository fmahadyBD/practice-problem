
import java.util.Stack;

/**
 * code4
 */
public class code4 {

    static void reversArray(int arr[]){
        Stack<Integer> st=new Stack<>();
        for(int i:arr)
        st.push(i);

        for(int i:st)
{
    System.out.println(i);
}
      for(int i=0;i<arr.length;i++){
        arr[i]=st.pop();
      }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,58};
        reversArray(arr);
        for(int i:arr)
        System.out.print(i+" ");
    }
}