/**
 * This "Summer" class is a simple introduction to
 * methods and variables / fields / private data members. 
 * 
 * @author Raymond Lister
 * @version April 2015; a "static" version for a Lab Test
 */

public class SummerStatic
{
  /*
   * The variables follow. These are also
   * called "fields" or "private data members".
   */

   private static int sum;   // sum of all integers received
   private static int count; // number of integers received
   
   
   public static void main(String [] args)
   { 
      /*
       * Note: This method "main" has been provided in
       * its entirety. You do NOT have to make any
       * changes to it.
       *
       * You could use this "main" method to test your code
       * before uploading to plate.
       */
      
       reset();
       putNumber(17);
       putNumber(1);
              
       System.out.print("count = " + getCount() + " ");
       System.out.print("sum = " + getSum() + " ");
       System.out.println("average = " + getAverage());
       
       // Repeat for a second set of numbers
       
       reset(3);
       putNumber(5);
       putNumber(7);
             
       System.out.print("count = " + getCount() + " ");
       System.out.print("sum = " + getSum() + " ");
       System.out.println("average = " + getAverage());
        
   } // method main
   
      
    /**
     * Receives and processes a new number in the series
     * 
     * ... remaining javadoc comment (if any) has been omitted from this skeleton ... 
     */
    public static void putNumber(int num)
    {
       count++;
       sum += num;
      
    }

    
    /**
     * Resets so all numbers previously forgotten. This is
     * dangerous since average is now undefined.
     * 
     * ... remaining javadoc comment (if any) has been omitted from this skeleton ... 
     */
    public static void reset()
    {
        count = 0;
        sum = 0;
    }
    
    
    /**
     * Resets with the first number of a new series. This is
     * safer reset since the average remains defined.
     * 
     * ... remaining javadoc comment (if any) has been omitted from this skeleton ...  
     */
    public static void reset(int num)
    {
        count = 1;
        sum = num;
    }
        
    
    /**
     * ... javadoc comment has been omitted from this skeleton ...  
     */
    public static int getSum()
    {
        return sum;
    }    
    
    
    /**
     * ... javadoc comment has been omitted from this skeleton ...  
     */
    public static int getCount()
    {
        return count;
    }
    

    /**
     * @return     The average of the integers received.
     */
    public static double getAverage()
    {
     /*
      * Note: This body of this method "getAverage" has
      * been provided in its entirety. You do NOT have
      * to make any changes to it.
     */

        return ( 
                 (double) sum  /  (double) count
               );
    }
    
} // class SummerStatic
