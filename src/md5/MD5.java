/*
 * Attempts to "break" MD5 by comparing the hash of a message to 
 * 1000000000 other message hashes 
 */
package md5;
import java.security.*;
import java.util.Arrays;
/**
 *
 * @author Adam Kennett 11/24/2014
 */
public class MD5 {

    /**Driver method, implements java's MD5 hash and attempts to find 2 values
     * with the same hash
     * @param void
     */
    public static void main(String[] args) throws Exception{
        
        MessageDigest md;
        md = MessageDigest.getInstance("MD5");
        
        String msg= "0";
        byte[] msgB = msg.getBytes();
        byte[] output = md.digest(msgB);
        
        //Tests if any Strings up to 1000000000 hash to the same value as 0
        for(int i =1; i<1000000000; i++)
        {
            String testString ="" + i;
            byte[] test = testString.getBytes();
            
            byte[] output2 = md.digest(test);
            
            if(Arrays.equals(output,output2))
            {
                System.out.println("0 and " + testString + " both hash to the same value" );
            }
        
        }
            System.out.println("no Matches found");
            
            
            
            
      
    }
    
}
