import java.util.HashMap;
import java.util.Map;

/**
 * code
 */
public class code {

    public int[] repeatedNumber(final int[] A) {
      
        int repeatedNumber = -1;
        int missingNumber = -1;
        
     
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : A) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        
        for (int i = 1; i <= A.length; i++) {
            if (!frequencyMap.containsKey(i)) {
                missingNumber = i;
            } else if (frequencyMap.get(i) > 1) {
                repeatedNumber = i;
            }
        }
        
       
        return new int[] { repeatedNumber, missingNumber };
    }
}