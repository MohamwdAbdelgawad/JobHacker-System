
package week3;

import java.util.Arrays;
import java.util.Random;
public class MinAndMaxOfArray {
    public static void main(String[] args) {
    int [] array = new int [1000];
             Random r = new Random();
             for(int i = 0 ; i<1000; i++) {
                 array[i]= r.nextInt();
             }
             int [] result = getMinMax(array);
             int min = result[0];
             int max= result[1];
            

    }
    public static int [] getMinMax(int [] array){
        Arrays.sort(array);
        int []result={array[0], array[array.length-1]};
        return result;
    }
}
