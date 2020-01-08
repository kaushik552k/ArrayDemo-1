/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 08/01/20
 *   Time: 3:46 PM
 */

package array;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] intergers = new int[10];
        initializeIntegerArray(intergers);
       /* for (int i = 0; i < intergers.length; i++) {
            System.out.println(intergers[i] + ",");
        }*/
        /*for (int i:intergers){
            System.out.println(i+",");
        }*/
       public static void printArrayValues( int[] integers){
           System.out.println(Arrays.toString(intergers));
        }



/**
 * insert
 * delete
 * search
 * sort
 * traverse
 *
 */
    }

    public static void initializeIntegerArray(int[] intergers) {
        for (int i = 0; i < intergers.length; i++) {
            intergers[i] = (i+1);
        }
    }
}