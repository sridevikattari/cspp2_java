/**
 * Given an array of elements, return the String that has two values separated
 * by commans. The first value is the sum of all the elements except minimum
 * and the second value is the sum of all the elements except the maximum.
 * 
 * Input : {1,2,3,4,5};
 * Output : 14,10
 * 
 * Input : {1,2}
 * Output : 2,1
 * 
 * @author Siva Sankar
 */
package MiniMaxSum;



public class MiniMaxSum {

    /**
     * This method returns the minimum element in the array.
     * @param arr, contains the elements in arr.
     * @return the minimum element in the arr. If there are no elements, then
     * it should return -1.
     */
    public static int min(int[] arr) {
        //  Your code goes here...
        if (arr.length<1)
            return 0;
        int m=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<m)
            m=arr[i];
        }
        
        return m;
    }

    /**
     * This method returns the maximum element in the array.
     * @param arr, contains the elements in arr.
     * @return the maximum element in the arr. If there are no elements, then
     * it should return -1.
     */
    public static int max(int[] arr) {
        //  Your code goes here...
        if (arr.length<1)
            return 0;
        int m=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>m)
            m=arr[i];
        }
        
        return m;
    }

    /**
     * This method returns the sum of all the elements in the array.
     * @param arr, contains the elements in arr.
     * @return the sum of all the elements in the arr. returns -1 if there are
     * no elements.
     */
    public static int sum(int[] arr) {
        //  Your code goes here...
        if (arr.length<1)
            return 0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    
    /**
     * Make use of the functions defined for finding the 
     * minimum element, maximum element and the sum of all the elements of teh 
     * array arr.
     * 
     * @param arr, the input array.
     * @return the string version of maxSum and minSum separated by commas.
     */
    public static String miniMaxSum(int[] arr) {
        //  Your code goes here...
        if (arr.length<=1)
            return "0,0";
        int max=max(arr);
        int min=min(arr);
        int s1=0,s2=0;
        if(min==max)
           {s1=sum(arr);
            s2=sum(arr);     
           }  
        else{
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=max )
               s1+=arr[i];       
            if(arr[i]!=min )
               s2+=arr[i];       
            
        
            }    }
            
        return s2+","+s1;
    }
}