package arrays;

import java.util.Arrays;

public class ArrayClone {
    public static void main(String[] args) {
        // copying arrays using assignment operator

        //If we change elements of one array, 
        //corresponding elements of the other arrays also change. 

        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;    
        for (int number: positiveNumbers) {
            System.out.print(number + ", ");
        }
        System.out.println("");

        //using loop

        //Here, the source and destination array refer to different objects (deep copy). 
        //Hence, if elements of one array are changed, corresponding elements of another array is unchanged.

        //the toString() method is used to convert an array into a string.

        int [] source = {1, 2, 3, 4, 5, 6};
        int [] destination = new int[6];
        for (int i = 0; i < source.length; ++i) {
            destination[i] = source[i];
        }
        System.out.println(Arrays.toString(destination));
        
        //using arraycopy() method
        //This method is a better approach to copy arrays than the above two.

        //arracopy(sourceArray, startPosition(source), destinationArray, startPos(dest), length)
        int[] n1 = {2, 3, 12, 4, 12, -2};
        int[] n3 = new int[5];
        int[] n2 = new int[n1.length];

        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));  
      
        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("n3 = " + Arrays.toString(n3));
        
        //using clone method
        
        int[] a ={1,8,3};
        int[] b = a.clone();
        b[0]++;
        System.out.println("Contents of a[] ");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        } 
        System.out.println("\nContents of b[] ");
        for (int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
    }
}
