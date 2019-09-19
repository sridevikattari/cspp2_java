
/**
 * Given an array of integers Find the mean, median, mode, standard deviation
 * and variance.
 * 
 * Mean
 * Input : [1,2,3,4,5]
 * Output : 3.0
 * 
 * Median
 * Input : [1,2,3,4,5]
 * Output : 3.0
 * 
 * Mode
 * Input : [1,1,2,2,3]
 * Output : [1,2]
 * 
 * Variance
 * Input : [1,2,3,4,5]
 * Output : 2.0
 * 
 * Standard Deviation
 * Input : [1,2,3,4,5]
 * Output : 1.41421356
 * 
 * @author Siva Sankar
 */
package Stats;
import java.util.Arrays;


public class Stats {

    /**
     * This method should return the mean of the elements of the array.
     * If the arr is empty (length is 0), return the mean as 0.
     * @param arr, the input array contians elements.
     * @return the mean of the array.
     */
    public static double mean(int[] arr) {
        //  Your code goes here....
        if(arr.length<1)
            return 0.0;
        if(arr.length==1)
            return arr[0];
        
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }

    /**
     * This method returns the median of the elements of the array.
     * Prerequisite : The array should be sorted to find the median.
     * 
     * Hint : Arrays.sort(arr) sorts the elements of the array.
     * 
     * @param arr, the input array contains random elements (not in sorted order)
     * @return the median of the elements of the array.
     */
    public static double median(int[] arr) {
        //  Your code goes here...
        int l=arr.length;
        if(l<1)
            return 0.0;
        if(l==1)
            return arr[0];
        if(l==2)
            return ((arr[0]+arr[1])/2.0);

        Arrays.sort(arr) ;
           
        if (l % 2 != 0) 
            return (double)arr[l/2]; 
           
         return (double)(arr[(l-1)/2] + arr[l/2])/2.0; 
    }

    /**
     * This method returns the mode of the array. If there is no mode, then it returns
     * 0 as the mode.
     * 
     * @param arr, the input array.
     * @return the mode of the array, 0 otherwise if there is no mode.
     */
    public static int mode(int[] arr) {
        //  Your code goes here....
        if(arr.length<1)
        return 0;
        if(arr.length==1)
            return arr[0];
        
        Arrays.sort(arr) ;
       
        int m=0;
        int count = 1;
        int countMode = 1;

        for (int i=1; i<arr.length; i++)
        {
            if (arr[i] == arr[i-1]) 
            {
                count++;
            }
            else
            {
                if (count > countMode) 
                {
                    countMode = count;
                    m = arr[i-1];
                }
                count = 1;
                
            }
        }
        if (count > countMode) 
                {
                   
                    m = arr[arr.length-1];
                }
                

        
        return m;
    }

    /**
     * This method returns the variance of the input array.
     * Make use of the mean functon which has already written.
     * 
     * @param arr, the input array
     * @return the variance of the array.
     */
    public static double variance(int[] arr) {
        //  Your code goes here....
        if(arr.length<1)
            return 0.0;
        if(arr.length==1)
            return arr[0];
        double m=mean(arr);
        // Compute sum squared  
       // differences with mean. 
        double sqDiff = 0; 
        for (int i = 0; i < arr.length; i++)  
            sqDiff += (arr[i] - m) *  
                      (arr[i] - m); 
        return sqDiff / arr.length; 
       
    }

    /**
     * This method returns the standard deviation of the array.
     * Hint : You can find the square root using Math.sqrt() method.
     * @param arr, the input array
     * @return the standard deviation of the input array.
     */
    public static double standardDeviation(int[] arr) {
        //  Your code goes here....
        if(arr.length<1)
        return 0.0;
        if(arr.length==1)
            return arr[0];

        return Math.sqrt(variance(arr));
    }
}