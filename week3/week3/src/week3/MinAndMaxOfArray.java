/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Eng Mohamed
 */
public class MinAndMaxOfArray {
    public static void main(String[] args) {
    int [] array = new int [1000];
             Random r = new Random();
             // fill the array with random numbers
             for(int i = 0 ; i<1000; i++) array[i]= r.nextInt();
             int [] result = getMinMax(array);
             int min = result[0];
             int max= result[1];
            

    }
    // first method use sorting of the array, it works at any  size of the array
    public static int [] getMinMax(int [] array){
        Arrays.sort(array);
        int []result={array[0], array[array.length-1]};
        // return result as array because methods is return only one value
        return result;
    }
}
