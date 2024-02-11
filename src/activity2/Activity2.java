/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity2;

import java.util.Arrays;

/**
 *
 * @author adamd
 */
public class Activity2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] any = {5,10,15,20,50};
       
        System.out.println("Array Elements:" + " \n" + Arrays.toString(any));
        
        int any_sum = any[0] + any[1] + any[2] + any[3] + any[4];
        
        System.out.println("Sum of all arrays:" + " \n" +any_sum);
        
        int max = Math.max(any[0], Math.max(any[1], Math.max(   any[2], Math.max(any[3], any[4])))) ;
        
        System.out.println("Maximum Value" + " \n" + max);
        
        
    }
    
}
