
public class code {
   
        public static int maxProfit(int[] p) {
          
            int min = p[0];
            int maxV = 0;
            int x=0;
    
           
            for(int i=0; i < p.length;i++){
               
              if(min<p[i]){
                x=p[i]-min;
                maxV = Math.max(x,maxV);
              }
              if(min>p[i]){
                min=p[i];
              }
       
            }
    
           
        return maxV;
    
        }
    
    public static void main(String[] args) {
        int arr[]={2,4,1};
        System.out.println(maxProfit(arr));
    }
}