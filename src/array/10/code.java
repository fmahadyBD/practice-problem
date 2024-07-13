
import java.util.PriorityQueue;

public class code {


        public int findKthLargest(int[] nums, int k) {
       
            PriorityQueue<Integer> pq=new PriorityQueue<>(k+1);
            for(int i: nums){
              pq.add(i);
              if(pq.size()>k){
                  pq.poll();
              }
            }
            return pq.poll(); 
      }    

 public static void main(String[] args) {
    
 }   
}
