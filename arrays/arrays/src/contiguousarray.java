 import java.util.HashMap; 
//find the maximum contigunous array with equal no of 1s and 0s
//Using HashMaps
public class contiguousarray {
     public int findmaxlength(int[] arr){
        int count = 0;
        int maxcount = 0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        hs.put(0,-1);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                count = count-1;
            }
            else{
                count = count+1;
            }
            if (hs.containsKey(count)) {
                maxcount = Math.max(maxcount, i-hs.get(count));

            }
            else{
                hs.put(count, i);
            }
            
        }
        return maxcount;
    } 
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,1,1,0};
        int n = arr.length;
        contiguousarray c = new contiguousarray();
        System.out.println(c.findSubArray(arr,n));
    }
    

        
    //using nested loops
        int findSubArray(int arr[], int n)
        {
            int sum = 0;
            int maxsize = -1, startindex = 0;
            int endindex = 0;
    
           
    
            for (int i = 0; i < n - 1; i++) {
                sum = (arr[i] == 0) ? -1 : 1;
    
                
    
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == 0)
                        sum += -1;
                    else
                        sum += 1;
    
                    
    
                    if (sum == 0 && maxsize < j - i + 1) {
                        maxsize = j - i + 1;
                        startindex = i;
                    }
                }
            }
            endindex = startindex + maxsize - 1;
            if (maxsize == -1)
                System.out.println("No such subarray");
            else
                System.out.println(startindex + " to " + endindex);
    
            return maxsize;
        }
    
       
       
    }
    

