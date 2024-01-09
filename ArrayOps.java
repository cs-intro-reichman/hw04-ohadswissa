public class ArrayOps {
    public static void main(String[] args) {
        //arrays for debugging purpuses 
        //int [] x = {7,5,4,3,-12};
        //int [] y = {1,2,3};
        //int [] z = {1,-2,3};
        //int [] l = {1,1,500};
        //int [] k = {1,3,2};
        //System.out.println(isSorted(x));
        //System.out.println(isSorted(y));
        //System.out.println(isSorted(z));
        //System.out.println(isSorted(l));
        //System.out.println(isSorted(k));
         
    }
    
    public static int findMissingInt (int [] array) {
        // Write your code here:
        int count = 0;
        int m = 0;
        if ( array.length == 1 ) 
        {
            return 1;
        }
        for ( int i = 0; i < array.length; i++)
        {
            count = 0;
            for (int j = 0; j < array.length; j++)
            {
                if (array[j] == i) count++;
            }
            if (count == 0) m = i;
        }
        return m;
    }
     
    public static int secondMaxValue(int [] array) {
        int count = 0;
        int max1 = array[0];
        int max2 = array[0];
        if ( array.length == 1 ) 
        {
           return array[0];
        }
        for ( int i = 0; i < array.length; i++)
        {
            if ( array[i] >= max1)
            {
                max1 = array[i];
            }
        }
         for ( int j = 0; j < array.length; j++)
        {
            if (( array[j] >= max2) && ( array[j] != max1)) 
            {
                max2 = array[j];
            }
            if (array[j] == max1)
            {
                count++;
            }
        }
        if (count > 1)
        {
            return max1;
        }

        return max2;

    }
    public static boolean containsTheSameElements(int [] array1,int [] array2) {
    int count = 0;
    boolean equal = true;
    for (int i = 0; i < array1.length; i++)
    {
        for (int j = 0; j < array2.length; j++)
        {
            if (array1[i] == array2[j]) 
            {
                count++;
            }
        }

        if (count == 0)
        {
           equal = false;
        }
    count = 0;
   }
         return equal;
    
    }

    public static boolean isSorted(int [] array) {
        int countup = 0;
        int countdown = 0;
        for ( int i = 0; i < array.length - 1; i++)
        {
            if ( array[i] <= array [i+1])
            {
                countup++;
            }
            if ( array[i] >= array [i+1])
            {
                countdown++;
            }
     
        }        
        if ((countup == array.length-1) || (countdown == array.length-1))
        {
            return true;
        }
        else 
        {
            return false;
        }

        }
        
        
    }

