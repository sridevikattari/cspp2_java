/**
 * Given a binary string that contains a sequence of 1's and 0's, returns an
 * equivalent to the decimal value in integer form.
 * 
 * Input : 1010
 * Output : 10
 * 
 * Input : 000000000000001010
 * Output : 10
 * 
 * @author Siva Sankar
 */
package BinaryToDecimal;
public class BinaryToDecimal {

    /**
     * This method reads in a Binary String and returns the equivalent to the
     * decimal value of the binary string.
     * @param s, the binary string that contains only sequence of 1's and 0's.
     * @return the decimal number n of the binary string.
     */
    public static int binaryToDecimal(String s) {
        int sum=0;
        int d=1;
        if(s.equals("0"))
            return (sum);
        if(s.equals("1"))
            return (d);
        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i)=='1')
                sum+=d;
            d*=2;
            
            
        }
        return sum;
        
    }
}